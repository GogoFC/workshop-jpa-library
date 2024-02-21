package se.lexicon.workshoplibrary.dao.Impl;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import se.lexicon.workshoplibrary.dao.BookDAO;
import se.lexicon.workshoplibrary.entity.Book;
import se.lexicon.workshoplibrary.repository.BookRepository;

@Repository
public class BookDaoImpl implements BookDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Autowired
    public BookRepository bookLoanRepository;

    @Override
    public Book update(Book book) {
        entityManager.merge(book);
        return bookLoanRepository.findById(book.getBookId()).get();
    }
}

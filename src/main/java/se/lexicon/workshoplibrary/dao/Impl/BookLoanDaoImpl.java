package se.lexicon.workshoplibrary.dao.Impl;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import se.lexicon.workshoplibrary.dao.BookLoanDAO;
import se.lexicon.workshoplibrary.entity.BookLoan;
import se.lexicon.workshoplibrary.repository.BookLoanRepository;
import se.lexicon.workshoplibrary.repository.BookRepository;


@Repository
public class BookLoanDaoImpl implements BookLoanDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Autowired
    public BookLoanRepository bookLoanRepository;


    @Override
    public BookLoan update(BookLoan bookLoan) {
        entityManager.merge(bookLoan);
        return bookLoanRepository.findById(bookLoan.getLoanId()).get();
    }
}

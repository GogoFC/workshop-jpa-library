package se.lexicon.workshoplibrary.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import se.lexicon.workshoplibrary.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {

    //Book findByBookId (int bookId);



}

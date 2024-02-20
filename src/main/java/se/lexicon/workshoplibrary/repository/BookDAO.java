package se.lexicon.workshoplibrary.repository;

import org.springframework.stereotype.Repository;
import se.lexicon.workshoplibrary.entity.Book;

@Repository
public interface BookDAO {

    Book findByBookId (int bookId);


}

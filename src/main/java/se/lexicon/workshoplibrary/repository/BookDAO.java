package se.lexicon.workshoplibrary.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import se.lexicon.workshoplibrary.entity.Book;

import java.util.Collection;
import java.util.List;

@Repository
public interface BookDAO extends JpaRepository<Book, Integer> {

    //Book findByBookId (int bookId);



}

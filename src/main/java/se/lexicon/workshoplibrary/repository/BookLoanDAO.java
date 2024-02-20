package se.lexicon.workshoplibrary.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import se.lexicon.workshoplibrary.entity.BookLoan;

@Repository
public interface BookLoanDAO extends CrudRepository<BookLoan, Integer> {
}

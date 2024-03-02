package se.lexicon.workshoplibrary.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import se.lexicon.workshoplibrary.entity.BookLoan;

@Repository
public interface BookLoanRepository extends JpaRepository<BookLoan, Integer> {
}

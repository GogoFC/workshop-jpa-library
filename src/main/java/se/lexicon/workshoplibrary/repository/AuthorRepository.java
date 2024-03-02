package se.lexicon.workshoplibrary.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import se.lexicon.workshoplibrary.entity.Author;

@Repository
public interface AuthorRepository extends JpaRepository<Author,Integer> {
}

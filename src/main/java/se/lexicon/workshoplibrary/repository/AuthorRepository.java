package se.lexicon.workshoplibrary.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import se.lexicon.workshoplibrary.entity.Author;

@Repository
public interface AuthorRepository extends CrudRepository<Author, Integer> {
}

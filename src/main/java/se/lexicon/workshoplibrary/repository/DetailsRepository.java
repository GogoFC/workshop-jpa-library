package se.lexicon.workshoplibrary.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import se.lexicon.workshoplibrary.entity.Details;

@Repository
public interface DetailsRepository extends JpaRepository<Details, Integer> {
}

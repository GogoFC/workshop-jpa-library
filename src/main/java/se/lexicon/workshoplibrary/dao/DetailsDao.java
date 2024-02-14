package se.lexicon.workshoplibrary.dao;

import se.lexicon.workshoplibrary.entity.Details;

import java.util.Collection;

public interface DetailsDao {

    Details findById(int id);

    Collection<Details> findAll();

    Details create(Details details);

    Details update(Details details);

    void delete(Details details);

}

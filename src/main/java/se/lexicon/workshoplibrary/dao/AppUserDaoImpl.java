package se.lexicon.workshoplibrary.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;
import se.lexicon.workshoplibrary.entity.AppUser;

import java.util.Collection;

@Repository
public class AppUserDaoImpl implements AppUserDao{

    @PersistenceContext
    private EntityManager entityManager;




    @Override
    @Transactional
    public AppUser create(AppUser appUser) {
        entityManager.persist(appUser);
        return appUser;
    }

    @Override
    public AppUser findById(int id) {
        return null;
    }

    @Override
    public Collection<AppUser> findAll() {
        return null;
    }

    @Override
    public AppUser update(AppUser appUser) {
        return null;
    }

    @Override
    public void delete(AppUser appUser) {

    }


}

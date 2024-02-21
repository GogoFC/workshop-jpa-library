package se.lexicon.workshoplibrary.dao.Impl;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;
import se.lexicon.workshoplibrary.dao.AppUserDao;
import se.lexicon.workshoplibrary.entity.AppUser;

import java.util.Collection;
import java.util.Optional;

@Repository
public class AppUserDaoImpl implements AppUserDao {

    @PersistenceContext
    private EntityManager entityManager;




    @Override
    @Transactional
    public AppUser create(AppUser appUser) {
        entityManager.persist(appUser);
        return appUser;
    }

    @Override
    public Optional<AppUser> findById(int id) {
        AppUser appUser = entityManager.find(AppUser.class, id);
        return Optional.ofNullable(appUser);
    }

    @Override
    public Collection<AppUser> findAll() {
        return entityManager.createQuery("SELECT a from AppUser a", AppUser.class)
                .getResultList();
    }

    @Override
    public AppUser update(AppUser appUser) {
        return null;
    }

    @Override
    public void delete(AppUser appUser) {

    }


}

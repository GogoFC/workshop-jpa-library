package se.lexicon.workshoplibrary.dao;

import se.lexicon.workshoplibrary.entity.AppUser;

import java.util.Collection;

public interface AppUserDao {

    AppUser findById(int id);

    Collection<AppUser> findAll();

    AppUser create(AppUser appUser);

    AppUser update(AppUser appUser);

    void delete(AppUser appUser);



}

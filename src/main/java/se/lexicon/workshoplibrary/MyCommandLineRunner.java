package se.lexicon.workshoplibrary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import se.lexicon.workshoplibrary.dao.AppUserDao;
import se.lexicon.workshoplibrary.entity.AppUser;

@Component
public class MyCommandLineRunner implements CommandLineRunner {

    @Autowired
    AppUserDao appUserDao;

    @Override
    public void run(String... args) throws Exception {

        AppUser user3 = new AppUser();
        user3.setUsername("user3");
        user3.setPassword("password");

        appUserDao.create(user3);



    }
}

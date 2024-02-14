package se.lexicon.workshoplibrary.dao;

import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import se.lexicon.workshoplibrary.entity.AppUser;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
@Rollback
class AppUserDaoImplTest {

    @Autowired
    AppUserDao appUserDao;
    @Test
    void create() {

        AppUser user = new AppUser();
        user.setUsername("user2");

        appUserDao.create(user);

        assertNotNull(user);
    }
}
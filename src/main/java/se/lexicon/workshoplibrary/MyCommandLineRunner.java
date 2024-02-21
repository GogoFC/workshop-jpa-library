package se.lexicon.workshoplibrary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import se.lexicon.workshoplibrary.dao.AppUserDao;
import se.lexicon.workshoplibrary.entity.AppUser;
import se.lexicon.workshoplibrary.entity.Book;
import se.lexicon.workshoplibrary.entity.BookLoan;
import se.lexicon.workshoplibrary.repository.BookRepository;

@Component
public class MyCommandLineRunner implements CommandLineRunner {

    @Autowired
    AppUserDao appUserDao;

    

    @Override
    public void run(String... args) throws Exception {

        AppUser user3 = new AppUser();
        user3.setUsername("Goran");
        user3.setPassword("password");

        appUserDao.create(user3);


        Book book1 = new Book("1234-5678-987", "book-1");
        Book book2 = new Book("1834-5878-997", "book-2");

        BookRepository

        BookLoan bookLoan = new BookLoan(user3, book1);
//        BookLoan





    }
}

package se.lexicon.workshoplibrary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import se.lexicon.workshoplibrary.dao.AppUserDao;
import se.lexicon.workshoplibrary.dao.AuthorDAO;
import se.lexicon.workshoplibrary.entity.AppUser;
import se.lexicon.workshoplibrary.entity.Author;
import se.lexicon.workshoplibrary.entity.Book;
import se.lexicon.workshoplibrary.entity.BookLoan;
import se.lexicon.workshoplibrary.repository.AuthorRepository;
import se.lexicon.workshoplibrary.repository.BookLoanRepository;
import se.lexicon.workshoplibrary.repository.BookRepository;

@Component
public class MyCommandLineRunner implements CommandLineRunner {

    AppUserDao appUserDao;
    BookRepository bookRepository;
    BookLoanRepository bookLoanRepository;

    AuthorRepository authorRepository;


    @Autowired
    public MyCommandLineRunner(AppUserDao appUserDao, BookRepository bookRepository, BookLoanRepository bookLoanRepository, AuthorRepository authorRepository) {
        this.appUserDao = appUserDao;
        this.bookRepository = bookRepository;
        this.bookLoanRepository = bookLoanRepository;
        this.authorRepository = authorRepository;
    }

    /*
    @Autowired
    public MyCommandLineRunner(AppUserDao appUserDao, BookRepository bookRepository, BookLoanRepository bookLoanRepository) {
        this.appUserDao = appUserDao;
        this.bookRepository = bookRepository;
        this.bookLoanRepository = bookLoanRepository;
    }
    
     */

    @Override
    public void run(String... args) throws Exception {

        AppUser user3 = new AppUser();
        user3.setUsername("Goran");
        user3.setPassword("password");

        appUserDao.create(user3);


        Book book1 = new Book("1234-5678-987", "book-1");
//        Book book2 = new Book("1834-5878-997", "book-2");

        bookRepository.save(book1);
//        bookRepository.save(book2);

        BookLoan bookLoan = new BookLoan(user3, book1);
//        BookLoan
        bookLoanRepository.save(bookLoan);


        Author jackie = new Author();
        jackie.setFirstName("Jackie");

        authorRepository.save(jackie);





    }
}

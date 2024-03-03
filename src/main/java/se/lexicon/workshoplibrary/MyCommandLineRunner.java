package se.lexicon.workshoplibrary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import se.lexicon.workshoplibrary.entity.AppUser;
import se.lexicon.workshoplibrary.entity.Author;
import se.lexicon.workshoplibrary.entity.Book;
import se.lexicon.workshoplibrary.entity.BookLoan;
import se.lexicon.workshoplibrary.repository.*;

@Component
public class MyCommandLineRunner implements CommandLineRunner {


    private BookRepository bookRepository;
    private AuthorRepository authorRepository;
    private AppUserRepository appUserRepository;
    private DetailsRepository detailsRepository;
    private BookLoanRepository bookLoanRepository;

    @Autowired
    public MyCommandLineRunner(BookRepository bookRepository, AuthorRepository authorRepository, AppUserRepository appUserRepository, DetailsRepository detailsRepository, BookLoanRepository bookLoanRepository) {
        this.bookRepository = bookRepository;
        this.authorRepository = authorRepository;
        this.appUserRepository = appUserRepository;
        this.detailsRepository = detailsRepository;
        this.bookLoanRepository = bookLoanRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Book java_book = new Book("9781491910771","Head First Java, 3rd Edition");
        Author Kathy_Sierra = new Author("Kathy","Sierra");
        Kathy_Sierra.addWrittenBooks(java_book);
        //java_book.addAuthor(Kathy_Sierra);

        bookRepository.save(java_book);
        authorRepository.save(Kathy_Sierra);

    }
}


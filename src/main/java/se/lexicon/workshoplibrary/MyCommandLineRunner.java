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

        Book c_book = new Book("9780131101630","The C Programming Language");
        Author Dennis = new Author("Dennis","Ritchie");



        // works
        java_book.addAuthor(Kathy_Sierra);
        c_book.addAuthor(Dennis);

        //c_book.removeAuthor(Dennis);

        // works
        //Dennis.addWrittenBooks(c_book);
        //Kathy_Sierra.addWrittenBooks(java_book);



        bookRepository.save(java_book);
        authorRepository.save(Kathy_Sierra);


        bookRepository.save(c_book);
        authorRepository.save(Dennis);


        //Below works when Dennis.addWrittenBooks(c_book) above; is used.
        //Dennis.removeWrittenBooks(c_book);
        //authorRepository.save(Dennis);

        // Works. Removes Dennis and saves using authorRepository. Can't save using bookRepository.
        c_book.removeAuthor(Dennis);
        //bookRepository.save(c_book);
        authorRepository.save(Dennis);







        //------------------------------------------------------------
        /*
        //below worked before adding Cascade
        Dennis.removeWrittenBooks(c_book);

        //authorRepository.save(Dennis);
        bookRepository.save(c_book);

        */
        /* doesn't work here
        Dennis.removeWrittenBooks(c_book);
        bookRepository.save(c_book);

         */

    }
}


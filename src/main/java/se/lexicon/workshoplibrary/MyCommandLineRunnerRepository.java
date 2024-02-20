package se.lexicon.workshoplibrary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import se.lexicon.workshoplibrary.entity.Book;
import se.lexicon.workshoplibrary.repository.BookDAO;
/*
@Component
public class MyCommandLineRunnerRepository implements CommandLineRunner {

    private BookDAO bookDAO;

    @Autowired
    public MyCommandLineRunnerRepository(BookDAO bookDAO){
        this.bookDAO = bookDAO;
    }

    @Override
    public void run(String... args) throws Exception {
        Book book4 = new Book();
        book4 = bookDAO.save(book4);
        System.out.println(book4);
    }
}
*/
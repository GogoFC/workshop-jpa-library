package se.lexicon.workshoplibrary.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import se.lexicon.workshoplibrary.entity.AppUser;
import se.lexicon.workshoplibrary.entity.Book;

import java.time.LocalDate;

@Getter
@Entity
public class BookLoan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int loanId;

    @Setter
    private LocalDate loanDate;
    @Setter
    private LocalDate dueDate;
    @Setter
    private boolean returned;

    @Setter
    @ManyToOne
    @JoinColumn(name = "app_user_id")
    private AppUser borrower;

    @Setter
    @ManyToOne
    @JoinColumn(name = "book_id")
    private Book book;

    public BookLoan() {
        this.loanDate = LocalDate.now();
        this.dueDate  = LocalDate.now().plusDays(7);
        this.returned = false;
    }

    public BookLoan(AppUser borrower, Book book) {
        this();
        this.borrower = borrower;
        this.book = book;
    }
}

package se.lexicon.workshoplibrary.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class BookLoan {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int loanId;

    private LocalDate loanDate;

    private LocalDate dueDate;

    @Column(columnDefinition = "false")
    private boolean returned;

    @ManyToOne
    @JoinColumn(name = "app_user_id")
    private AppUser borrower;

    @ManyToOne
    @JoinColumn(name = "book_id")
    private Book book;


}

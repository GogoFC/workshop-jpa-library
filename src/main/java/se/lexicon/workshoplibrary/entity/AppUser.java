package se.lexicon.workshoplibrary.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor

@Entity
public class AppUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int appUserId;

    @Setter
    private String password;

    @Setter
    @Column(unique = true)
    private String username;

    private LocalDate regDate;

    @Setter
    @OneToOne
    @JoinColumn(name = "details_id")
    private Details details;

    @OneToMany(mappedBy = "borrower")
    private List<BookLoan> loans;
/*
    public void addBookLoan (BookLoan bookLoan) {
        loans.add(bookLoan);
        bookLoan.g
    }
    
 */


}

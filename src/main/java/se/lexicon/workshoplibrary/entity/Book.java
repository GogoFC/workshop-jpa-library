package se.lexicon.workshoplibrary.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Getter
@NoArgsConstructor
@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int bookId;


    @Setter
    @Column(nullable = false, unique = true)
    private String isbn;

    @Setter
    @Column(nullable = false)
    private String title;

    @Setter
    @Column
    private int maxLoanDays = 7;

    @Setter
    @ManyToMany
    @JoinColumn(name = "author_id")
    private Set<Author> authors;


    public Book(String isbn, String title) {
        this.isbn = isbn;
        this.title = title;
    }
}

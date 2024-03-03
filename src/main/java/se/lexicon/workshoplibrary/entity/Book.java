package se.lexicon.workshoplibrary.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
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
    @ManyToMany(mappedBy = "writtenBooks",
            cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Set<Author> authors = new HashSet<>();


    public Book(String isbn, String title) {
        this.isbn = isbn;
        this.title = title;
    }

    public void addAuthor (Author author) {
        if (!authors.contains(author)) {
            authors.add(author);
        }
    }

    public void removeAuthor (Author author) {
        if (authors.contains(author)) {
            authors.remove(author);
        }
    }

    /*
    // to ask, overrides contains method in interface collection
    public void addAuthor (Author author) {
        if (!authors.contains(author)) {
            authors.add(author);
        }
    }

     */

    /* Method for without JoinTable
    public void addAuthor(Author author) {
        authors.add(author);
        author.getWrittenBooks().add(this);
    }

    public void removeAuthor(Author author) {
        author.getWrittenBooks().remove(this);
        authors.remove(author);
    }

     */
}

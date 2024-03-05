package se.lexicon.workshoplibrary.entity;

import jakarta.persistence.*;
import lombok.*;

import javax.swing.*;
import java.util.HashSet;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Entity
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int authorId;

    @Setter
    private String firstName;

    @Setter
    private String lastName;

    @ManyToMany(cascade =
            {CascadeType.PERSIST,CascadeType.MERGE})
    @JoinTable(name = "author_books_rel",
            joinColumns = @JoinColumn(name = "author_id"),
            inverseJoinColumns = @JoinColumn(name = "book_id"))
    private Set<Book> writtenBooks = new HashSet<>();


    public void addWrittenBooks (Book book) {
        if (!writtenBooks.contains(book)) {
            writtenBooks.add(book);
        }
    }

    public void removeWrittenBooks (Book book) {
        if (writtenBooks.contains(book)) {
            writtenBooks.remove(book);
        }
    }


    /* Method for without JoinTable
    public void addWrittenBooks(Book book) {
        writtenBooks.add(book);
        book.getAuthors().add(this);
    }
    public void removeWrittenBooks(Book book) {
        book.getAuthors().remove(this);
        writtenBooks.remove(book);
    }

     */

    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }


}

package se.lexicon.workshoplibrary.entity;

import jakarta.persistence.*;
import lombok.*;

import javax.swing.*;
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
    @Setter
    @ManyToMany(mappedBy = "")
    private Set<Book> writtenBooks;


}

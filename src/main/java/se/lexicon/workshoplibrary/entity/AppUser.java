package se.lexicon.workshoplibrary.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

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

}

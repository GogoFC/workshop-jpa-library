package se.lexicon.workshoplibrary.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.autoconfigure.web.WebProperties;

import java.time.LocalDate;

@Getter
@NoArgsConstructor
@AllArgsConstructor

@Entity
public class Details {



    //
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int detailsId;

    @Setter
    @Column(unique = true)
    private String email;

    @Setter
    private String name;

    @Setter
    private LocalDate birthDate;

}

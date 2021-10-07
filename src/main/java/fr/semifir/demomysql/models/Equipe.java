package fr.semifir.demomysql.models;

import lombok.Data;
import net.bytebuddy.implementation.bind.annotation.Super;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Equipe {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nom;

    @ManyToMany(mappedBy = "equipe")
    private List<Superhero> equipiers;
}

package fr.semifir.demomysql.models;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class SuperVilain {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nom;


//    @ManyToOne(cascade = CascadeType.ALL, optional = true)
//    @JoinColumn(name = "superhero_id")
//    private Superhero superhero;

}

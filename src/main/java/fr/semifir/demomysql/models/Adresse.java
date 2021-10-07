package fr.semifir.demomysql.models;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Adresse {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String label;

}

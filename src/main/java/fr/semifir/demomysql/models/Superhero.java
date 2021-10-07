package fr.semifir.demomysql.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.Period;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Superhero {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "nom")
    private String nom;

    @Column(name = "super_pouvoir")
    private String superPouvoir;

    @Column(name= "date_naissance")
    private LocalDate dateNaissance;

    @Transient
    private Integer age;

    public Integer getAge(){
        return Period.between(this.getDateNaissance(), LocalDate.now()).getYears();
    }
}

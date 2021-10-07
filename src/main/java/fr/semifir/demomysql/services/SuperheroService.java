package fr.semifir.demomysql.services;

import fr.semifir.demomysql.models.Superhero;

import java.util.List;

public interface SuperheroService {
    List<Superhero> findAll();
    Superhero findById(Long id);
    Superhero save(Superhero superhero);
    void delete(Long id);
}

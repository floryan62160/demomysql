package fr.semifir.demomysql.services;

import fr.semifir.demomysql.models.Superhero;
import fr.semifir.demomysql.repositories.SuperheroRepository;

import java.util.List;

public class SuperheroServiceImpl implements SuperheroService{

    private SuperheroRepository superheroRepository;

    public SuperheroServiceImpl(SuperheroRepository superheroRepository){
        this.superheroRepository = superheroRepository;
    }

    @Override
    public List<Superhero> findAll() {
        return this.superheroRepository.findAll();
    }

    @Override
    public Superhero findById(Long id) {
        return null;
    }

    @Override
    public Superhero save(Superhero superhero) {
        return this.superheroRepository.save(superhero);
    }

    @Override
    public void delete(Long id) {

    }
}

package fr.semifir.demomysql.controllers;

import fr.semifir.demomysql.models.Superhero;
import fr.semifir.demomysql.services.SuperheroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("super-hero")
public class SuperheroController {

    private SuperheroService superheroService;

    @Autowired
    public SuperheroController(SuperheroService superheroService){
        this.superheroService = superheroService;
    }

    @GetMapping
    public List<Superhero> findAll() {
        return superheroService.findAll();
    }

    @GetMapping("{id}")
    public Superhero findById(@PathVariable Long id) {
        return superheroService.findById(id);
    }

    @PostMapping
    public Superhero save(@RequestBody Superhero superhero) {
        return superheroService.save(superhero);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable  Long id) {
        superheroService.delete(id);
    }
}

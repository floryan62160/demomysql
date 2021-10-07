package fr.semifir.demomysql.repositories;

import fr.semifir.demomysql.models.Superhero;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SuperheroRepository extends JpaRepository<Superhero, Long> {
}

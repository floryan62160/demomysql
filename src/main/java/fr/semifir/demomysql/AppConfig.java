package fr.semifir.demomysql;

import fr.semifir.demomysql.repositories.SuperheroRepository;
import fr.semifir.demomysql.services.SuperheroService;
import fr.semifir.demomysql.services.SuperheroServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public SuperheroService superheroService(SuperheroRepository superheroRepository){
        return new SuperheroServiceImpl(superheroRepository);
    }
}

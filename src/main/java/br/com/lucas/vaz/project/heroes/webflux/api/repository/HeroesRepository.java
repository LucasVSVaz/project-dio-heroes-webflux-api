package br.com.lucas.vaz.project.heroes.webflux.api.repository;

import br.com.lucas.vaz.project.heroes.webflux.api.document.Heroes;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

@EnableScan
public interface HeroesRepository extends CrudRepository<Heroes, String>{
}

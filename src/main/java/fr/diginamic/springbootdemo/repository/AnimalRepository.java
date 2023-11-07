package fr.diginamic.springbootdemo.repository;


import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fr.diginamic.springbootdemo.model.Animal;
import fr.diginamic.springbootdemo.model.Species;

@Repository
public interface AnimalRepository extends CrudRepository<Animal, Integer>{
	List<Animal>findBySpecies(Species species);
	List<Animal>findByColorIn(List<String> color);

}

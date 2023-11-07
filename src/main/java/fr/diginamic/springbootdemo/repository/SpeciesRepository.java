package fr.diginamic.springbootdemo.repository;


import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fr.diginamic.springbootdemo.model.Species;

@Repository
public interface SpeciesRepository extends CrudRepository<Species, Integer>{
	Species findFirstByCommonName(String commonName);
	List<Species>findByLatinNameContainsIgnoreCase(String latinName);
}

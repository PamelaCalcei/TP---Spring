package fr.diginamic.springbootdemo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fr.diginamic.springbootdemo.model.Species;

@Repository
public interface SpeciesRepository extends CrudRepository<Species, Integer>{

}

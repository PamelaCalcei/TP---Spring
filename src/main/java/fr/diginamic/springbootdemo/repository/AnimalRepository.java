package fr.diginamic.springbootdemo.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fr.diginamic.springbootdemo.model.Animal;

@Repository
public interface AnimalRepository extends CrudRepository<Animal, Integer>{

}

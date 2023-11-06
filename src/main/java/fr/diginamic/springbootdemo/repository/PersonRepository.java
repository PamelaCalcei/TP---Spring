package fr.diginamic.springbootdemo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fr.diginamic.springbootdemo.model.Person;

@Repository
public interface PersonRepository extends CrudRepository<Person, Integer>{

}

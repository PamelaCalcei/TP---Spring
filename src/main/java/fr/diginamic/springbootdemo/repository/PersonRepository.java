package fr.diginamic.springbootdemo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fr.diginamic.springbootdemo.model.Person;

@Repository
public interface PersonRepository extends CrudRepository<Person, Integer>{
	List<Person>findByLastnameOrFirstname(String lastname, String firstname);
	List<Person>findByAgeGreaterThanEqual(Integer age);
}

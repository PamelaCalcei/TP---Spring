package fr.diginamic.springbootdemo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fr.diginamic.springbootdemo.model.Animal;
import fr.diginamic.springbootdemo.model.Person;

@Repository
public interface PersonRepository extends CrudRepository<Person, Integer>, PersonRepositoryCustom{
	List<Person>findByLastnameOrFirstname(String lastname, String firstname);
	List<Person>findByAgeGreaterThanEqual(Integer age);
	@Query("SELECT u FROM Person u WHERE u.age BETWEEN :minAge AND :maxAge")
	List<Person>findByAgeBetween(Integer minAge, Integer maxAge);
	@Query("SELECT u FROM Person u inner join u.animals a WHERE a = :animal ")
	List<Person>findByPersonAnimal(Animal animal);
	
}

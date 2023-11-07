package fr.diginamic.springbootdemo.repository;


import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fr.diginamic.springbootdemo.enums.Sex;
import fr.diginamic.springbootdemo.model.Animal;
import fr.diginamic.springbootdemo.model.Species;

@Repository
public interface AnimalRepository extends CrudRepository<Animal, Integer>{
	List<Animal>findBySpecies(Species species);
	List<Animal>findByColorIn(List<String> color);
	@Query("SELECT COUNT(u) FROM Animal u WHERE u.sex = :sex")
	Integer countBySex(Sex sex);
	@Query("SELECT CASE WHEN SIZE(u.person) > 0 THEN TRUE ELSE false END from Animal u WHERE u = :pasOrphelin ")
	Boolean checkIfAnimalIsNotOrphelin(Animal pasOrphelin);
	
	

}

package fr.diginamic.springbootdemo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import fr.diginamic.springbootdemo.enums.Sex;
import fr.diginamic.springbootdemo.model.Animal;
import fr.diginamic.springbootdemo.repository.AnimalRepository;
import fr.diginamic.springbootdemo.repository.PersonRepository;
import fr.diginamic.springbootdemo.repository.SpeciesRepository;

@SpringBootApplication
public class Tp2Application implements CommandLineRunner {

	@Autowired
	private AnimalRepository animalRepository;
	@Autowired
	private PersonRepository personRepository;
	@Autowired
	private SpeciesRepository speciesRepository;


	public static void main(String[] args) {
		SpringApplication.run(Tp2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(">>>>>>>>>>Liste des animaux : " + this.animalRepository.findAll());
		System.out.println(">>>>>>>>>>Liste des personnes : " + this.personRepository.findAll());
		System.out.println(">>>>>>>>>>Liste des espèces : " + this.speciesRepository.findAll());
		Animal animal1 = new Animal();
	    animal1.setColor("Gris");
	    animal1.setName("Léone");
	    animal1.setSex(Sex.F);
	    animal1.setSpecies(speciesRepository.findById(1).orElseThrow());
	    animalRepository.save(animal1);
//	    personRepository.delete(personRepository.findById(3).orElseThrow());
	    System.out.println(">>>>>>>>>>Espèce de chats : " + speciesRepository.findFirstByCommonName("Chat"));
	    System.out.println(">>>>>>>>>>Espèce contenant Oryctolagus : " + speciesRepository.findByLatinNameContainsIgnoreCase("oryctolagus"));
	    System.out.println(">>>>>>>>>>Chercher par prénom ou nom : " + personRepository.findByLastnameOrFirstname("Mangolo", "Henri"));
	    System.out.println(">>>>>>>>>>Chercher personnes avec un age supérieur ou égal : " + personRepository.findByAgeGreaterThanEqual(40));
	    System.out.println(">>>>>>>>>>Renvoie tous les animaux de la Species Fournie : " + animalRepository.findBySpecies(speciesRepository.findById(1).orElseThrow()));
	    List<String> colors = new ArrayList<>();
	    colors.add("Roux");
	    colors.add("Gris tacheté");
	    System.out.println(">>>>>>>>>>Renvoie une liste de couleur : " + animalRepository.findByColorIn(colors));
	    System.out.println(">>>>>>>>>>Trie les species par nom commun asc : " + speciesRepository.findByNameAsc());
	    System.out.println(">>>>>>>>>>Species avec un nom commun LIKE params : " + speciesRepository.findByCommonNameLike("Chat"));
	    System.out.println(">>>>>>>>>> Chercher personnes dont l'âge est entre age min et age max" + personRepository.findByAgeBetween(30,90));
	    System.out.println(">>>>>>>>>> Chercher toutes les personnes qui possèdent l'animal" + personRepository.findByPersonAnimal(animalRepository.findById(4).orElseThrow()));
	    System.out.println(">>>>>>>>>>Renvoie le nombre d'animaux dont le Sex est égal à la valeur " + animalRepository.countBySex(Sex.F));
	    System.out.println(">>>>>>>>>> " + animalRepository.checkIfAnimalIsNotOrphelin(animalRepository.findById(3).orElseThrow()));
	    
	    
	}
}

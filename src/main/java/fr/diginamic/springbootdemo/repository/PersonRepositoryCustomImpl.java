package fr.diginamic.springbootdemo.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import fr.diginamic.springbootdemo.model.Person;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

public class PersonRepositoryCustomImpl implements PersonRepositoryCustom {

	@PersistenceContext
	private EntityManager em;
	List<String> firstNamed = new ArrayList<>();
	List<String> lastNamed = new ArrayList<>();
	List<Integer> aged = new ArrayList<>();


	

	@Override
	public void deletePerson() {
		em.createQuery("DELETE FROM Person u WHERE size(u.animals) = 0").executeUpdate();

	}

	@Override
	public void generateEntity(Integer nombre) {
		firstNamed.add("Marie-Joseph");
		firstNamed.add("Bertrand");
		firstNamed.add("Babeth");
		firstNamed.add("Clotilde");
		firstNamed.add("Marinette");
		firstNamed.add("Georges");
		firstNamed.add("Gérard");
		
		lastNamed.add("Dupont");
		lastNamed.add("Duprés");
		lastNamed.add("De La Rue");
		lastNamed.add("Dupont");
		lastNamed.add("Leroux");
		lastNamed.add("Laporte");
		
		aged.add(489);
		aged.add(-4);
		aged.add(1455644);
		
		for (int i = 0; i < nombre; i++) {
			Person persons = new Person();
			persons.setFirstname(firstNamed.get(new Random().nextInt(firstNamed.size())));
			persons.setLastname(lastNamed.get(new Random().nextInt(lastNamed.size())));
			persons.setAge(aged.get(new Random().nextInt(aged.size())));
			em.persist(persons);


		}
		
	

	}

}

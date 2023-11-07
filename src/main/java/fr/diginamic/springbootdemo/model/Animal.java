package fr.diginamic.springbootdemo.model;

import java.util.ArrayList;
import java.util.List;

import fr.diginamic.springbootdemo.enums.Sex;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

@Entity
public class Animal {
	@Id
	private int id;
	private String color;
	private String name;
	@Enumerated(EnumType.STRING)
	private Sex sex;
	@ManyToOne
	@JoinColumn(name = "species_id")
	private Species species;
	@ManyToMany(mappedBy = "animals")
	private List<Person> person = new ArrayList<>();

	public Species getSpecies() {
		return species;
	}

	public void setSpecies(Species species) {
		this.species = species;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	

	public Sex getSex() {
		return sex;
	}

	public void setSex(Sex sex) {
		this.sex = sex;
	}

	@Override
	public String toString() {
		return "Animal [id=" + id + ", color=" + color + ", name=" + name + ", sex=" + sex + ", species=" + species + "]";
	}
	
	

}

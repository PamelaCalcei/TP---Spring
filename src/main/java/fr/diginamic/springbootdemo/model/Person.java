package fr.diginamic.springbootdemo.model;


import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import jakarta.persistence.ManyToMany;

@Entity
public class Person {
	@Id
	private int id;
	private Integer age;
	private String firstname;
	private String lastname;
	@ManyToMany
	private List<Animal> animals = new ArrayList<>();
	
	
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "Personnes : id : " + id + ", âge : " + age + ", Prénom : " + firstname + ", Nom : " + lastname;
	}
	
	
	
	
	
		
}

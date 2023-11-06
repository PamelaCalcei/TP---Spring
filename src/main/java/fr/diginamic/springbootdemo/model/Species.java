package fr.diginamic.springbootdemo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Species {
	@Id
	private int id;
	private String common_name;
	private String latin_name;
	
	
	public String getCommon_name() {
		return common_name;
	}
	public void setCommon_name(String common_name) {
		this.common_name = common_name;
	}
	public String getLatin_name() {
		return latin_name;
	}
	public void setLatin_name(String latin_name) {
		this.latin_name = latin_name;
	}
	
	
}

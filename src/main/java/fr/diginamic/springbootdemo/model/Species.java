package fr.diginamic.springbootdemo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Species {
	@Id
	private int id;
	@Column(name="common_name")
	private String commonName;
	@Column(name="latin_name")
	private String latinName;
	
	
	public String getCommon_name() {
		return commonName;
	}
	public void setCommon_name(String commonName) {
		this.commonName = commonName;
	}
	public String getLatin_name() {
		return latinName;
	}
	public void setLatin_name(String latinName) {
		this.latinName = latinName;
	}
	@Override
	public String toString() {
		return "Species [id=" + id + ", commonName=" + commonName + ", latinName=" + latinName + "]";
	}
	
	
	
	
}

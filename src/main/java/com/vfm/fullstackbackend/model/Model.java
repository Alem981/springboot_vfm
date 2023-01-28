package com.vfm.fullstackbackend.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
 
public class Model {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id", updatable = false, nullable=false)
	private int id;
	private String name;
	@ManyToOne // One brand - many models
	private Brand brand;
	public Model() {
		
	}


	public Model(int id, String name, Brand brand) {
		super();
		this.id = id;
		this.name = name;
		this.brand = brand;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Brand getBrand() {
		return brand;
	}


	public void setBrand(Brand brand) {
		this.brand = brand;
	} 
	

}

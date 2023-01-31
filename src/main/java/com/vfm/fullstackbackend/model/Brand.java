package com.vfm.fullstackbackend.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
@Entity
public class Brand {
	  @Id
	  private int id;
	  private String name;
	  @OneToMany(mappedBy = "brand", cascade = CascadeType.ALL)
	  private List<Model> models;
	public int getId() {
		return id;
		
	}
	public Brand () {
		
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
	public Brand(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	  
	  
	  	  
	  // public virtual ICollection<Model> Models { get; set; } = new List<Model>();
	  
}

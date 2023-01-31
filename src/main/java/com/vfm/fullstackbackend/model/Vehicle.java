package com.vfm.fullstackbackend.model;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
@Entity
public class Vehicle {
	@Id   	
    public int id;   
    public String registration;
    public Integer seats; 
    public Integer vehicleWeight/*Kg*/;   
    public Integer enginPower/*kW*/;
    @ManyToOne //one Model - many vehicles
    private Model model;
   
    
    public Vehicle() {
    	
    }
    
    

	public Vehicle(Integer id, String registration, Integer seats, Integer vehicleWeight, Integer enginPower,
			Model model) {
		super();
		this.id = id;
		this.registration = registration;
		this.seats = seats;
		this.vehicleWeight = vehicleWeight;
		this.enginPower = enginPower;
		this.model = model;
	}



	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getRegistration() {
		return registration;
	}

	public void setRegistration(String registration) {
		this.registration = registration;
	}

	public Integer getSeats() {
		return seats;
	}

	public void setSeats(Integer seats) {
		this.seats = seats;
	}

	public Integer getVehicleWeight() {
		return vehicleWeight;
	}

	public void setVehicleWeight(Integer vehicleWeight) {
		this.vehicleWeight = vehicleWeight;
	}

	public Integer getEnginPower() {
		return enginPower;
	}

	public void setEnginPower(Integer enginPower) {
		this.enginPower = enginPower;
	}

	public Model getModel() {
		return model;
	}

	public void setModel(Model model) {
		this.model = model;
	}
    
   
   
}

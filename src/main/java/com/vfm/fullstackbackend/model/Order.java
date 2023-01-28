package com.vfm.fullstackbackend.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
 public class Order {
	 @Id
	  private int id;
	  private String startLocation;
	  private String endLocation;
	  private String customer;	  
	  private int price;
	  private int cost;
	  @ManyToOne // One Vehicle - many models
	  private Vehicle vehicle;
	  
	  public Order() {
		  
	  }
	public Order(int id, String startLocation, String endLocation, String customer, int price, int cost,
			Vehicle vehicle) {
		super();
		this.id = id;
		this.startLocation = startLocation;
		this.endLocation = endLocation;
		this.customer = customer;
		this.price = price;
		this.cost = cost;
		this.vehicle = vehicle;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStartLocation() {
		return startLocation;
	}
	public void setStartLocation(String startLocation) {
		this.startLocation = startLocation;
	}
	public String getEndLocation() {
		return endLocation;
	}
	public void setEndLocation(String endLocation) {
		this.endLocation = endLocation;
	}
	public String getCustomer() {
		return customer;
	}
	public void setCustomer(String customer) {
		this.customer = customer;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public Vehicle getVehicle() {
		return vehicle;
	}
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	  
	  
}

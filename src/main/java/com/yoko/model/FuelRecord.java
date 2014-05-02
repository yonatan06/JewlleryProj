package com.yoko.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "FUEL_RECORDS")
public class FuelRecord{

	@Id
	@GeneratedValue
	private Long id;
	
	private String timestamp;
	
	private int currentKM;
	
	private float amount;
	
	private float price;
	
//	@ManyToOne
//	private User user;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public int getCurrentKM() {
		return currentKM;
	}

	public void setCurrentKM(int currentKM) {
		this.currentKM = currentKM;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

//	public User getUser() {
//		return user;
//	}
//
//	public void setUser(User user) {
//		this.user = user;
//	}	
	
	
}

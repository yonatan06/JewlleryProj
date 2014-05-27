package com.yoko.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "users_info")
public class UserInfo {

	@Id
	private String username;
	
	@OneToOne(cascade = CascadeType.ALL)  
	private CarInstance carInstance;
	
	private String firstName;
	
	private String lastName;
	
	@OneToMany(mappedBy="userInfo", cascade=CascadeType.ALL , fetch=FetchType.LAZY)
	private List<FuelRecord> fuelRecords;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	

	public CarInstance getCarInstance() {
		return carInstance;
	}

	public void setCarInstance(CarInstance carInstance) {
		this.carInstance = carInstance;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	
	
	
	
}

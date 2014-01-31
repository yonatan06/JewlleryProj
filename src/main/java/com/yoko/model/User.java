package com.yoko.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;



@Entity
@Table(name = "USERS", uniqueConstraints = @UniqueConstraint(columnNames = {"username"}))

public class User {


	@Id
	@GeneratedValue
	private Long id;
	
	private String username;
	
	private String firstName;
	private String lastName;
	
	private String password;
	
	@OneToMany(mappedBy="user", cascade=CascadeType.ALL , fetch=FetchType.EAGER)
	private List<FuelRecord> fuelRecords;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<FuelRecord> getFuelRecords() {
		return fuelRecords;
	}

	public void setFuelRecords(List<FuelRecord> fuelRecords) {
		this.fuelRecords = fuelRecords;
	}
	
	

}

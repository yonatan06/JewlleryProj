package com.yoko.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;



@Entity
@Table(name = "CAR_INSTANCES")
public class CarInstance {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String color;
	
	private int year;
	
	@ManyToOne
	private CarModel carModel;
	
	@OneToOne(mappedBy = "carInstance", cascade = CascadeType.ALL)
	private UserInfo userInfo;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public CarModel getCarModel() {
		return carModel;
	}
	public void setCarModel(CarModel carModel) {
		this.carModel = carModel;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}

	
}

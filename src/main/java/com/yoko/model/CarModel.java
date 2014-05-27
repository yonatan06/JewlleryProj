package com.yoko.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "CAR_MODELS")
public class CarModel {
	

		@Id
		@GeneratedValue
		private Long id;
		
		private String company;
		
		private String model;
		
		@OneToMany(mappedBy="carModel", cascade=CascadeType.ALL , fetch=FetchType.LAZY)
		private List<CarInstance> carInstances;
		
		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getCompany() {
			return company;
		}

		public void setCompany(String company) {
			this.company = company;
		}

		public String getModel() {
			return model;
		}

		public void setModel(String model) {
			this.model = model;
		}

		public List<CarInstance> getCarInstances() {
			return carInstances;
		}

		public void setCarInstances(List<CarInstance> carInstances) {
			this.carInstances = carInstances;
		}



}

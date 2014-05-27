package com.yoko.repository;

import java.util.List;

import com.yoko.model.CarModel;

public interface ICarModelRepositoryCustom {

	CarModel findByCompanyAndModel(String company, String model);

	List<String> getCarModels(String carBrand);

	List<String> getCarBrands();
	
}

package com.yoko.repository;

import com.yoko.model.CarModel;

public interface ICarModelRepositoryCustom {

	CarModel findByCompanyAndModel(String company, String model);
	
}

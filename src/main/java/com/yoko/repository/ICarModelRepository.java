package com.yoko.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yoko.model.CarModel;

public interface ICarModelRepository extends JpaRepository<CarModel, Long>{


}
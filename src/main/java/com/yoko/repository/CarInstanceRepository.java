package com.yoko.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yoko.model.CarInstance;

public interface CarInstanceRepository extends JpaRepository<CarInstance, Long>{
	
}

package com.yoko.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yoko.model.CarInstance;

public interface ICarInstanceRepository extends JpaRepository<CarInstance, Long>{
	
}

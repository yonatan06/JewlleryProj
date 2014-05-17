package com.yoko.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yoko.model.FuelRecord;

public interface IFuelRecordRepository extends JpaRepository<FuelRecord, Long>{


}
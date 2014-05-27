package com.yoko.repository;

import java.util.List;

import com.yoko.model.FuelRecord;

public interface IFuelRecordRepositoryCustom {

	List<FuelRecord> getUserFuelRecords(String loggedInUserName);

}

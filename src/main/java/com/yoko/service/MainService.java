package com.yoko.service;

import java.util.List;

import com.yoko.model.CarInstance;
import com.yoko.model.CarModel;
import com.yoko.model.CreateUser;
import com.yoko.model.FuelRecord;
import com.yoko.model.MyStatisticsReport;

public interface MainService {

//	public abstract void saveUser(User user);

	public abstract void saveCarInstance(CarInstance carInstance);

	public abstract void saveCarModel(CarModel carModel);

	public abstract void saveFuelRecord(FuelRecord fuelRecord);

//	public abstract List<User> loadAllUsers();

	public abstract List<CarInstance> loadAllCarInstances();

	public abstract List<CarModel> loadAllCarModels();

	public abstract List<FuelRecord> loadAllFuelRecords();

	public abstract String getCurrentTimestamp();

	public abstract MyStatisticsReport getMyStatisticsReport();

	public abstract void createUser(CreateUser createUser);

}
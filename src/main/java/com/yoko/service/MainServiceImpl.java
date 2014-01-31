package com.yoko.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yoko.model.CarInstance;
import com.yoko.model.CarModel;
import com.yoko.model.FuelRecord;
import com.yoko.model.User;
import com.yoko.repository.CarInstanceRepository;
import com.yoko.repository.CarModelRepository;
import com.yoko.repository.FuelRecordRepository;
import com.yoko.repository.UserRepository;

@Service("mainService")
public class MainServiceImpl implements MainService{
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private CarInstanceRepository carInstanceRepository;
	
	@Autowired
	private CarModelRepository carModelRepository;
	
	@Autowired
	private FuelRecordRepository fuelRecordRepository;
	
	
	@Transactional
	public void saveUser(User user){
		userRepository.save(user);
	}

	@Transactional
	public void saveCarInstance(CarInstance carInstance){
		carInstanceRepository.save(carInstance);
	}

	@Transactional
	public void saveCarModel(CarModel carModel){
		carModelRepository.save(carModel);
	}

	@Transactional
	public void saveFuelRecord(FuelRecord fuelRecord){
		fuelRecordRepository.save(fuelRecord);
	}
	
	
	public List<User> loadAllUsers(){
		return userRepository.findAll();
	}

	public List<CarInstance> loadAllCarInstances(){
		return carInstanceRepository.findAll();
	}

	public List<CarModel> loadAllCarModels(){
		return carModelRepository.findAll();
	}

	public List<FuelRecord> loadAllFuelRecords(){
		return fuelRecordRepository.findAll();
	}
	
}
 
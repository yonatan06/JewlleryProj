package com.yoko.service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yoko.model.CarInstance;
import com.yoko.model.CarModel;
import com.yoko.model.FuelRecord;
import com.yoko.model.MyStatisticsReport;
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

	public String getCurrentTimestamp() {
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Calendar cal = Calendar.getInstance();
		return dateFormat.format(cal.getTime());
	}

	public MyStatisticsReport getMyStatisticsReport() {
		List<FuelRecord> fuelRecords = loadAllFuelRecords();
		MyStatisticsReport report = new MyStatisticsReport();
		//need to get fuel records sorted by date
		report.setFuelRecords(fuelRecords);
		report.setCurrentCarKM(fuelRecords.get(fuelRecords.size()-1).getCurrentKM());
		float avarageFuelConsume = getAvarageFuelConsume(fuelRecords);
		report.setAvarageFuelConsume(avarageFuelConsume);
		return report;
	}

	private float getAvarageFuelConsume(List<FuelRecord> fuelRecords) {
		if(fuelRecords.size() < 2){
			return 0;
		}
		float[] fuelConsumes = new float[fuelRecords.size()-1];
		for (int i = 1; i < fuelRecords.size(); i++) {
			FuelRecord last = fuelRecords.get(i-1);
			FuelRecord current = fuelRecords.get(i);
			int kmDiff = current.getCurrentKM() - last.getCurrentKM();
			float fuelAmount = last.getAmount();
			float fuelConsume = kmDiff/fuelAmount;
			fuelConsumes[i-1] = fuelConsume;
		}
		float avarageFuelConsume = avarage(fuelConsumes);
		return avarageFuelConsume;
	}

	private float avarage(float[] arr) {
		float sum=0;
		for (float f : arr) {
			sum+=f;
		}
		return sum/arr.length;
	}
	
}
 
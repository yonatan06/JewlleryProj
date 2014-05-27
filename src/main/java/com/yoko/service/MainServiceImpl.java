package com.yoko.service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yoko.model.Authority;
import com.yoko.model.Authority.Role;
import com.yoko.model.CarInstance;
import com.yoko.model.CarModel;
import com.yoko.model.CreateUser;
import com.yoko.model.FuelRecord;
import com.yoko.model.MyStatisticsReport;
import com.yoko.model.User;
import com.yoko.model.UserInfo;
import com.yoko.repository.IAuthorityRepository;
import com.yoko.repository.ICarInstanceRepository;
import com.yoko.repository.ICarModelRepository;
import com.yoko.repository.ICarModelRepositoryCustom;
import com.yoko.repository.IFuelRecordRepository;
import com.yoko.repository.IFuelRecordRepositoryCustom;
//import com.yoko.repository.UserRepository;
import com.yoko.repository.IUserInfoRepository;
import com.yoko.repository.IUserRepository;

@Service("mainService")
public class MainServiceImpl implements MainService{
	
//	@Autowired
//	private UserRepository userRepository;
	
	@Autowired
	private ICarInstanceRepository carInstanceRepository;
	
	@Autowired
	private ICarModelRepository carModelRepository;
	
	@Autowired
	private ICarModelRepositoryCustom carModelRepositoryCustom;
	
	@Autowired
	private IFuelRecordRepository fuelRecordRepository;
	
	@Autowired
	private IFuelRecordRepositoryCustom fuelRecordRepositoryCustom;
	
	@Autowired
	private IUserInfoRepository userInfoRepository;
	
	@Autowired
	private IUserRepository userRepository; 
	
	@Autowired
	private IAuthorityRepository authorityRepository;
	
//	@Transactional
//	public void saveUser(User user){
//		userRepository.save(user);
//	}

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
		String loggedInUsername = getLoggedInUsername();
		UserInfo userInfo = userInfoRepository.findOne(loggedInUsername);
		fuelRecord.setUserInfo(userInfo);
		fuelRecordRepository.save(fuelRecord);
	}
	
	
//	public List<User> loadAllUsers(){
//		return userRepository.findAll();
//	}

	public List<CarInstance> loadAllCarInstances(){
		return carInstanceRepository.findAll();
	}

	public List<CarModel> loadAllCarModels(){
		return carModelRepository.findAll();
	}

	public List<FuelRecord> getFuelRecords(String loggedInUserName){
		return fuelRecordRepositoryCustom.getUserFuelRecords(loggedInUserName);
	}

	public String getCurrentTimestamp() {
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Calendar cal = Calendar.getInstance();
		return dateFormat.format(cal.getTime());
	}

	public MyStatisticsReport getMyStatisticsReport() {
		String loggedInUserName = getLoggedInUsername();
		List<FuelRecord> fuelRecords = getFuelRecords(loggedInUserName);
		MyStatisticsReport report = new MyStatisticsReport();
		//need to get fuel records sorted by date
		report.setFuelRecords(fuelRecords);
		if(!fuelRecords.isEmpty()){
			report.setCurrentCarKM(fuelRecords.get(fuelRecords.size()-1).getCurrentKM());
		}
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

	public void createUser(CreateUser createUser) {
		UserInfo userInfo = createUser.getUserInfo();
		CarModel carModel = userInfo.getCarInstance().getCarModel(); // carModel without id
		//getting the car id
		carModel = carModelRepositoryCustom.findByCompanyAndModel(carModel.getCompany(),carModel.getModel());
		userInfo.getCarInstance().setCarModel(carModel);
		User user = new User();
		user.setPassword(createUser.getPassword());
		user.setUsername(userInfo.getUsername());
		userRepository.saveUser(user);

		userInfoRepository.saveAndFlush(userInfo);
		
		Authority authority = new Authority();
		authority.setUsername(userInfo.getUsername());
		authority.setRole(Role.USER);
		authorityRepository.saveAuthority(authority);
		
	}

	
	private String getLoggedInUsername(){
		 Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	     return auth.getName();
	}

	public List<String> getCarModels(String carBrand) {
		return carModelRepositoryCustom.getCarModels(carBrand);
	}
	
	public List<String> getCarBrands() {
		return carModelRepositoryCustom.getCarBrands();
	}
	
	
	
	
}
 
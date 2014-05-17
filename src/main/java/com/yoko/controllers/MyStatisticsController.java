package com.yoko.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yoko.model.CarModel;
import com.yoko.service.MainService;

@Controller
public class MyStatisticsController {
	@Autowired
	private MainService mainService;
	
	@RequestMapping(value= "/myStatistics" , method = RequestMethod.GET)
	public String getMyStatisticsPage(){
		return "myStatistics";
	}
	
	@RequestMapping(value= "/globalStatistics" , method = RequestMethod.GET)
	public String getGlobalStatisticsPage(){
		return "globalStatistics";
	}
	
	@RequestMapping(value= "/getCarModels" , method = RequestMethod.GET)
	public @ResponseBody List<String> getCarModels(){ 
		System.out.println("got car model requets!");
		List<String> retVal = new ArrayList<String>();
		List<CarModel> carModels = mainService.loadAllCarModels();
		for (CarModel carModel : carModels) {
			retVal.add(carModel.getCompany()+" - "+carModel.getModel());
		}
		return retVal;
	}
	
	
}

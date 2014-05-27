package com.yoko.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

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
	public @ResponseBody List<String> getCarBrands(){ 
		return mainService.getCarBrands();
	}
	
	@RequestMapping(value= "/getCarModels" , method = RequestMethod.POST)
	public @ResponseBody List<String> getCarModels(@RequestBody String carBrand){
		if(carBrand == null){
			return null;
		}
		if(carBrand.endsWith("=")){
			carBrand = carBrand.substring(0,carBrand.length()-1);
		}
		return mainService.getCarModels(carBrand);
	}
	
	
}

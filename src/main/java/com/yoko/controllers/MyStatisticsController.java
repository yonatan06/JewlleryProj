package com.yoko.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yoko.model.FuelRecord;
import com.yoko.model.MyStatisticsReport;
import com.yoko.service.MainService;

@Controller
public class MyStatisticsController {
	@Autowired
	private MainService mainService;
	
	@RequestMapping(value= "/myStatistics" , method = RequestMethod.GET)
	public String getAddFuelRecordPage(){
		return "myStatistics";
	}
	
	@RequestMapping(value= "/getFuelRecords" , method = RequestMethod.GET)
	public @ResponseBody MyStatisticsReport getFuelRecords(){
		return mainService.getMyStatisticsReport();
	}
	
}

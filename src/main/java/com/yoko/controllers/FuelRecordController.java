package com.yoko.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.yoko.model.FuelRecord;
import com.yoko.model.MyStatisticsReport;
import com.yoko.service.MainService;

@Controller
@SessionAttributes("fuelRecord")
public class FuelRecordController {

	@Autowired
	private MainService mainService;
	
	@RequestMapping(value= "/addFuelRecord" , method = RequestMethod.GET)
	public String getAddFuelRecordPage(Model model, HttpSession session){
		FuelRecord fuelRecord = new FuelRecord();
		
		model.addAttribute("fuelRecord",fuelRecord);
		
		return "addFuelRecord";
	}
	
	@RequestMapping(value= "/addFuelRecord" , method = RequestMethod.POST)
	public String addFuelRecord(@ModelAttribute("fuelRecord") FuelRecord fuelRecord){
		fuelRecord.setTimestamp(mainService.getCurrentTimestamp());
		mainService.saveFuelRecord(fuelRecord);
		return "redirect:myStatistics.html";
	}
	
	@RequestMapping(value= "/getFuelRecords" , method = RequestMethod.GET)
	public @ResponseBody MyStatisticsReport getFuelRecords(){
		return mainService.getMyStatisticsReport();
	}
	
	
}

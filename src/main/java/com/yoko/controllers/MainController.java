package com.yoko.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.yoko.service.MainService;


@Controller
public class MainController {

	@Autowired
	private MainService mainService;
	
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String findAllActivities(){
		return "home";
	}
	
	
	
}

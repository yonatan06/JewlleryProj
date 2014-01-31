package com.yoko.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.yoko.service.MainService;


@Controller
public class LoginController {

	@Autowired
	private MainService mainService;
	
	@RequestMapping(value= "/home" , method = RequestMethod.GET)
	public String getHomePage(){
		//if(loggedIn)
		//return home
		//else return login
		return "login";
	}
	
	@RequestMapping(value= "/home" , method = RequestMethod.POST)
	public String login(){
		return "home";
	}
	
	
	
	
	
	
}

package com.yoko.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.yoko.service.MainService;


@Controller
public class LoginController {

	@Autowired
	private MainService mainService;
	
//	@RequestMapping(value= "/home" , method = RequestMethod.GET)
//	public String getHomePage(){
//		return "login";
//	}
	
//	@RequestMapping(value= "/home" , method = RequestMethod.POST)
//	public String login(){
//		return "home";
//	}
	
	@RequestMapping (value="/index",method=RequestMethod.GET)
	public String index (ModelMap model){
		return "myStatistics";
	}

	@RequestMapping (value="/login",method=RequestMethod.GET)
	public String getHomePage (ModelMap model){
		return "login";
	}
	
//	@RequestMapping (value="/login",method=RequestMethod.POST)
//	public String login (ModelMap model){
//		return "home";
//	}
	
//	@RequestMapping(value="/loginFailed",method=RequestMethod.GET)
//	public String loginFailed(ModelMap model){
//		System.out.println("Login Failed");
//		
//		model.addAttribute("error", "true");
//		return "login";
//	}
//	
//	@RequestMapping(value="/logout",method=RequestMethod.GET)
//	public String logout(ModelMap model){
//		return "logout";
//	}
//	
//	@RequestMapping(value="/403",method=RequestMethod.GET)
//	public String error403(ModelMap model){
//		return "403";
//	}
	
	
}

package com.yoko.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.yoko.model.CreateUser;
import com.yoko.service.MainService;


@Controller
@SessionAttributes("createUser")
public class LoginController {

	@Autowired
	private MainService mainService;

	@RequestMapping (value="/login",method=RequestMethod.GET)
	public String getHomePage (ModelMap model){
		return "login";
	}
	
	@RequestMapping (value="/signUp",method=RequestMethod.GET)
	public String getSignUpPage (Model model){
		model.addAttribute("createUser",new CreateUser());
		return "signUp";
	}
	
	@RequestMapping (value="/signUp",method=RequestMethod.POST)
	public String signUp (@ModelAttribute("createUser") CreateUser createUser, BindingResult result){
		if(!createUser.getPassword().equals(createUser.getRetypePassword())){
			return "signUp";
		}
		mainService.createUser(createUser);
		return "login";
	}
	
	
}

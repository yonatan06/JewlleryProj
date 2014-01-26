package com.yoko.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yoko.model.ImgDesc;
import com.yoko.service.MainService;


@Controller
public class MainController {

	@Autowired
	private MainService mainService;
	
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String findAllActivities(){
		return "home";
	}
	
	@RequestMapping(value = "/example", method = RequestMethod.GET)
	public String example(){
		mainService.saveImage(new ImgDesc("img/1.jpg"));
		mainService.saveImage(new ImgDesc("img/2.jpg"));
		return "example";
	}
	
	@RequestMapping(value = "/getimages", method = RequestMethod.GET)
	public @ResponseBody List<ImgDesc> getImages(){
		List<ImgDesc> result = mainService.getImages(); 
		return result;
	}
	
	
	
}

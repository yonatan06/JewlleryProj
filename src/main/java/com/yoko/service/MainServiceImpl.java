package com.yoko.service;

import org.springframework.stereotype.Service;

@Service("mainService")
public class MainServiceImpl implements MainService{

	public String getHomeHtml() {
		return "<html><body><h1>blu blll</h1></body></html>";
	}
	
	
	
}
 
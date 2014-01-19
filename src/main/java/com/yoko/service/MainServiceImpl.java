package com.yoko.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.yoko.model.ImgDesc;

@Service("mainService")
public class MainServiceImpl implements MainService{

	public String getHomeHtml() {
		return "<html><body><h1>blu blll</h1></body></html>";
	}

	public List<ImgDesc> getImages() {
		List<ImgDesc> lst = new ArrayList<ImgDesc>();
		lst.add(new ImgDesc("img/1.jpg"));
		lst.add(new ImgDesc("img/2.jpg"));
		return lst;
	}
	
	
	
}
 
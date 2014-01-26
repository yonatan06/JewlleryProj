package com.yoko.service;

import java.util.List;

import com.yoko.model.ImgDesc;

public interface MainService {

	String getHomeHtml();

	void saveImage(ImgDesc imgDesc);
	
	List<ImgDesc> getImages();

}

package com.yoko.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yoko.model.ImgDesc;
import com.yoko.repository.ImgDescRepository;

@Service("mainService")
public class MainServiceImpl implements MainService{

	@Autowired
	private ImgDescRepository imgDescRepository;
	
	public String getHomeHtml() {
		return "<html><body><h1>blu blll</h1></body></html>";
	}

	@Transactional
	public void saveImage(ImgDesc imgDesc) {
		imgDescRepository.save(imgDesc);
	}
	
	@Transactional
	public List<ImgDesc> getImages() {
		return imgDescRepository.loadAll();
//		List<ImgDesc> lst = new ArrayList<ImgDesc>();
//		lst.add(new ImgDesc("img/1.jpg"));
//		lst.add(new ImgDesc("img/2.jpg"));
//		return lst;
	}
	
	
	
}
 
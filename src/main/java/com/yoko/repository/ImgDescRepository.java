package com.yoko.repository;

import java.util.List;

import com.yoko.model.ImgDesc;

public interface ImgDescRepository {
	
	void save(ImgDesc imgDesc);

	List<ImgDesc> loadAll();
}

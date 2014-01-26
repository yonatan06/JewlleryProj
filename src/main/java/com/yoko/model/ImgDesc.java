package com.yoko.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ImagesDescription")
public class ImgDesc {

	@Id
	@GeneratedValue
	private Long id;
	
	private String path;

	public ImgDesc(){
		
	}
	
	public ImgDesc(String path){
		this.path = path;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}
	
}

package com.yoko.repository;

import org.springframework.stereotype.Repository;

import com.yoko.model.User;

public interface IUserRepository{

	public void saveUser(User user);

}
package com.yoko.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yoko.model.User;


public interface UserRepository extends JpaRepository<User, Long>{

}

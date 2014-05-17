package com.yoko.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yoko.model.UserInfo;

public interface IUserInfoRepository extends JpaRepository<UserInfo, String>{

}

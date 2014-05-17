package com.yoko.repository;

import org.springframework.stereotype.Repository;

import com.yoko.model.Authority;

public interface IAuthorityRepository {

	public abstract void saveAuthority(Authority authority);

}
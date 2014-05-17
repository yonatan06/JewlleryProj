package com.yoko.repository;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.yoko.model.Authority;

@Repository
public class AuthorityRepository implements IAuthorityRepository {


	 @Autowired
	 DataSource dataSource;

	 /* (non-Javadoc)
	 * @see com.yoko.repository.IAuthorityRepository#saveAuthority(com.yoko.model.Authority)
	 */
	public void saveAuthority(Authority authority) {

		 String query = "INSERT INTO authorities VALUES (?, ?)";

		 JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		 update(jdbcTemplate,query,authority.getUsername(),authority.getRole().toString());
		 
	 }
	
	private void update(JdbcTemplate jdbcTemplate,String sql,Object... objs) {
		jdbcTemplate.update(sql,objs);
	}

	
}

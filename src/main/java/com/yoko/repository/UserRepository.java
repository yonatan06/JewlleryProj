package com.yoko.repository;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Repository;

import com.yoko.model.User;

@Repository
public class UserRepository implements IUserRepository{

	 @Autowired
	 DataSource dataSource;

	 /* (non-Javadoc)
	 * @see com.yoko.repository.IUserRepository#saveUser(com.yoko.model.User)
	 */
	public void saveUser(User user) {

		 String password = encodePassword(user.getPassword());
		 String query = "INSERT INTO users VALUES (?, ?, ?)";

		 JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		 update(jdbcTemplate,query,user.getUsername(),password,1);
		 
	 }
	
	private void update(JdbcTemplate jdbcTemplate,String sql,Object... objs) {
		jdbcTemplate.update(sql,objs);
	}

	private String encodePassword(String password) {
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		String hashedPassword = passwordEncoder.encode(password);
		return hashedPassword;
	}
	
	
	
	
}

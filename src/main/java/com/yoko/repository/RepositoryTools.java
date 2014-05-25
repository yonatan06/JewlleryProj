package com.yoko.repository;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class RepositoryTools {

	public static <T> T query(JdbcTemplate jdbcTemplate,String sql, RowMapper<T> rowMapper, Object... objs) {
		return jdbcTemplate.queryForObject(sql, objs, rowMapper);
	}

	public static void update(JdbcTemplate jdbcTemplate,String sql,Object... objs) {
		jdbcTemplate.update(sql,objs);
	}
	
}

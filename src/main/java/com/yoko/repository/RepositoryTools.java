package com.yoko.repository;

import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class RepositoryTools {

	public static <T> T query(JdbcTemplate jdbcTemplate,String sql, RowMapper<T> rowMapper, Object... objs) {
		return jdbcTemplate.queryForObject(sql, objs, rowMapper);
	}

	public static void update(JdbcTemplate jdbcTemplate,String sql,Object... objs) {
		jdbcTemplate.update(sql,objs);
	}

	public static <T> List<T> queryList(JdbcTemplate jdbcTemplate,	String sql, RowMapper<T> rowMapper, Object... objs) {
		return jdbcTemplate.query(sql, objs, rowMapper);
	}
	
}

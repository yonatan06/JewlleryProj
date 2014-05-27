package com.yoko.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.yoko.model.FuelRecord;

@Repository
public class FuelRecordRepositoryCustom implements IFuelRecordRepositoryCustom {

	@Autowired
	DataSource dataSource;	

	public List<FuelRecord> getUserFuelRecords(String loggedInUserName) {
		String query = "SELECT * FROM fuel_records f where f.userInfo_username = ?";
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		RowMapper<FuelRecord> rowMapper = new RowMapper<FuelRecord>() {
			public FuelRecord mapRow(ResultSet rs, int rowNum) throws SQLException {
				FuelRecord fuelRecord = new FuelRecord();
				fuelRecord.setAmount(rs.getFloat("amount"));
				fuelRecord.setCurrentKM(rs.getInt("currentKM"));
				fuelRecord.setId(rs.getLong("id"));
				fuelRecord.setPrice(rs.getFloat("price"));
				fuelRecord.setTimestamp(rs.getString("timestamp"));
				return fuelRecord;
			}
		};
		List<FuelRecord> lst = RepositoryTools.queryList(jdbcTemplate,query,rowMapper,loggedInUserName);
		return lst;
	}



}

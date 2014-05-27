package com.yoko.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.yoko.model.CarModel;

@Repository
public class CarModelRepository implements ICarModelRepositoryCustom {

	 @Autowired
	 DataSource dataSource;
	
	public CarModel findByCompanyAndModel(String company, String model) {
		String query = "SELECT * FROM car_models c where c.company = ? and c.model = ?";
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		RowMapper<CarModel> rowMapper = new CarModelRowMapper();

		CarModel carModel = RepositoryTools.query(jdbcTemplate,query,rowMapper,company,model);
		return carModel;
	}
		
	private class CarModelRowMapper implements RowMapper<CarModel>{

		public CarModel mapRow(ResultSet rs, int rowNum) throws SQLException {
			CarModel carModel = new CarModel();
			carModel.setId(rs.getLong("id"));
			carModel.setCompany(rs.getString("company"));
			carModel.setModel(rs.getString("model"));
			return carModel;
		}
		
	}


	public List<String> getCarModels(String carBrand) {
		String query = "SELECT model FROM car_models c where c.company = ?";
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		RowMapper<String> rowMapper = new RowMapper<String>() {
			public String mapRow(ResultSet rs, int rowNum) throws SQLException {
				return rs.getString("model");
			}
		};
		List<String> lst = RepositoryTools.queryList(jdbcTemplate,query,rowMapper,carBrand);
		return lst;
	}


	public List<String> getCarBrands() {
		String query = "SELECT DISTINCT company FROM car_models";
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		RowMapper<String> rowMapper = new RowMapper<String>() {
			public String mapRow(ResultSet rs, int rowNum) throws SQLException {
				return rs.getString("company");
			}
		};
		List<String> lst = RepositoryTools.queryList(jdbcTemplate,query,rowMapper);
		return lst;
	}


	
	
}

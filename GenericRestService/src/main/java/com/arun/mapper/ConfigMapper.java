package com.arun.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.arun.util.ConfigurationBean;

public class ConfigMapper implements RowMapper<ConfigurationBean> {

	@Override
	public ConfigurationBean mapRow(ResultSet rs, int arg1) throws SQLException {

		ConfigurationBean cb = new ConfigurationBean();
		cb.setConsumerId(rs.getString(1));
		cb.setName(rs.getString(2));
		cb.setAttributes(rs.getString(3));
		return cb;
	}

}

package com.arun.dao;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.arun.mapper.ConfigMapper;
import com.arun.util.ConfigurationBean;

@Repository
public class ConfigurationDetailsImpl extends JdbcDaoSupport implements ConfigurationDetails {
	@Autowired
	private DataSource dataSource;

	private final String selectSQL = "select consumerid, country, attributes from configuration";

	@PostConstruct
	private void initialize() {
		setDataSource(dataSource);
	}

	@Override
	public List<ConfigurationBean> fetchConfigurationDetails() {
		List<ConfigurationBean> lstConfig = getJdbcTemplate().query(selectSQL, new ConfigMapper());
		return lstConfig;
	}

}

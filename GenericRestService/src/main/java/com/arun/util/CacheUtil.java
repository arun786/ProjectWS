package com.arun.util;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.arun.dao.ConfigurationDetails;

@Component
public class CacheUtil {
	@Autowired
	private ConfigurationDetails configurationDetails;

	@Scheduled(cron = "*/10 * * * * *")
	public void cache() {
		List<ConfigurationBean> lstConfig = configurationDetails.fetchConfigurationDetails();
		System.out.println(lstConfig);
	}

}

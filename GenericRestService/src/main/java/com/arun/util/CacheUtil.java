package com.arun.util;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.arun.dao.ConfigurationDetails;

@Component
public class CacheUtil {
	@Autowired
	private ConfigurationDetails configurationDetails;
	
	@Value("${app.name}")
	private String name;

	private static Map<String, Consumer> consumerDetails = new HashMap<>();

	@Scheduled(cron = "*/10 * * * * *")
	public void cache() {
		
		System.out.println("Name " + name);
		
		List<ConfigurationBean> lstConfig = configurationDetails.fetchConfigurationDetails();

		for (ConfigurationBean beans : lstConfig) {
			Consumer consumer = new Consumer();
			consumer.setConsumerId(beans.getConsumerId());
			consumer.setCountry(beans.getCountry());
			consumer.setAttributes(beans.getAttributes());

			consumerDetails.put(beans.getConsumerId(), consumer);
		}

	}

	public static Map<String, Consumer> getConsumerDetailsBean() {
		return consumerDetails;
	}
}

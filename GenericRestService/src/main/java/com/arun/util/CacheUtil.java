package com.arun.util;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.arun.dao.ConfigurationDetails;

@Component
public class CacheUtil {
	@Autowired
	private ConfigurationDetails configurationDetails;

	private static Map<String, Consumer> consumerDetails = new HashMap<>();

	@Scheduled(cron = "*/10 * * * * *")
	public void cache() {
		List<ConfigurationBean> lstConfig = configurationDetails.fetchConfigurationDetails();

		for (ConfigurationBean beans : lstConfig) {
			Consumer consumer = new Consumer();
			consumer.setConsumerId(beans.getConsumerId());
			consumer.setConsumerName(beans.getName());
			consumer.setAttributes(beans.getAttributes());

			consumerDetails.put(beans.getConsumerId(), consumer);
		}
	}
}

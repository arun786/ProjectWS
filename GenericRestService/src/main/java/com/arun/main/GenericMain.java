/**
 * 
 */
package com.arun.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author Adwiti
 *
 */
@EnableAutoConfiguration
@Configuration
@ComponentScan(basePackages = { "com.arun.controller", "com.arun.service", "com.arun.dao", "com.arun.util" })
@EnableScheduling
@PropertySource("classpath:app.properties")
public class GenericMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(GenericMain.class, args);
	}
}

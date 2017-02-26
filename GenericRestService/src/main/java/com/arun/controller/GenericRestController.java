/**
 * 
 */
package com.arun.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.arun.util.CacheUtil;

/**
 * @author Adwiti
 *
 */
@RestController
public class GenericRestController {
	

	@RequestMapping(value = "/user", method = RequestMethod.GET)
	public ResponseEntity<?> getAllUser() {
		return new ResponseEntity<>(CacheUtil.getConsumerDetailsBean(), HttpStatus.OK);
	}

}

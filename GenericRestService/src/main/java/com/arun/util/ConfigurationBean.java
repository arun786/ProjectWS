/**
 * 
 */
package com.arun.util;

/**
 * @author Adwiti
 *
 */
public class ConfigurationBean {
	private String consumerId;
	private String country;
	private String attributes;

	public String getConsumerId() {
		return consumerId;
	}

	public void setConsumerId(String consumerId) {
		this.consumerId = consumerId;
	}


	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getAttributes() {
		return attributes;
	}

	public void setAttributes(String attributes) {
		this.attributes = attributes;
	}

	@Override
	public String toString() {
		return "ConfigurationBean [consumerId=" + consumerId + ", name=" + country + ", attributes=" + attributes + "]";
	}

}

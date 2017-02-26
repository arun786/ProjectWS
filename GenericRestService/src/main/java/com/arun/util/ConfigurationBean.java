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
	private String name;
	private String attributes;

	public String getConsumerId() {
		return consumerId;
	}

	public void setConsumerId(String consumerId) {
		this.consumerId = consumerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAttributes() {
		return attributes;
	}

	public void setAttributes(String attributes) {
		this.attributes = attributes;
	}

	@Override
	public String toString() {
		return "ConfigurationBean [consumerId=" + consumerId + ", name=" + name + ", attributes=" + attributes + "]";
	}

}

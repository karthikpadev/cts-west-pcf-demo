package com.cts.west;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="message")
public class EmployeeConfiguration {
	private String one;

	public String getOne() {
		return one;
	}

	public void setOne(String one) {
		this.one = one;
	}
}

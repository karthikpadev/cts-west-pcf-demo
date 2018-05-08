package com.cts.west;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RefreshScope
public class EmployeeApplication {
	
	@Autowired
	private EmployeeConfiguration properties;
	
	@Value("${message.two}")
	private String two;

	public static void main(String[] args) {
		SpringApplication.run(EmployeeApplication.class, args);
	}
	
	@RequestMapping
	public String printConfig() {
		StringBuilder sb = new StringBuilder();
		sb.append(properties.getOne());
		sb.append(" || ");
		sb.append(two);
		
		return sb.toString();
	}
}

package com.fd.webservices.webservicesframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

//@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
@SpringBootApplication()
public class WebservicesframeworkApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebservicesframeworkApplication.class, args);
	}

}

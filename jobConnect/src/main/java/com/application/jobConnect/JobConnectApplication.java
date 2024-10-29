package com.application.jobConnect;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class JobConnectApplication {

	public static void main(String[] args) {

		SpringApplication.run(JobConnectApplication.class, args);
	}

}

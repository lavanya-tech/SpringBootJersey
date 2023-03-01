package com.example.hibernatedemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class HibernatedemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(HibernatedemoApplication.class, args);
	}

}

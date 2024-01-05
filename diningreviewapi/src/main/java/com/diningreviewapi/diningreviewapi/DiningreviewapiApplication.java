package com.diningreviewapi.diningreviewapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = "com.diningreviewapi.diningreviewapi.entities")
@EnableJpaRepositories(basePackages = "com.diningreviewapi.diningreviewapi.repositories")

public class DiningreviewapiApplication {

	public static void main(String[] args) {
	 SpringApplication.run(DiningreviewapiApplication.class, args);
		
	}
}

package com.gedalias.securitypoc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.config.EnableMongoAuditing;

@SpringBootApplication
@EnableMongoAuditing
public class SecurityPocApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecurityPocApplication.class, args);
	}

}

package com.managerbff.managerbff;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;

@SpringBootApplication
@EnableWebFluxSecurity
public class ManagerBffApplication {

	public static void main(String[] args) {
		SpringApplication.run(ManagerBffApplication.class, args);
	}

}

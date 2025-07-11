package com.erdoganpacaci.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan(basePackages = {"com.erdoganpacaci"})
@EntityScan(basePackages = {"com.erdoganpacaci"})
@EnableJpaRepositories(basePackages = {"com.erdoganpacaci"})
@SpringBootApplication
public class GaleristApplicationStarter {

	public static void main(String[] args) {
		SpringApplication.run(GaleristApplicationStarter.class, args);
	}

}

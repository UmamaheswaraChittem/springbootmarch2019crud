package com.springboot.beginner.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication //@Configuration + @ComponentScan + @AutoConfiguration
@EnableAutoConfiguration
@ComponentScan(basePackages= {"com.springboot.beginner"})
@EnableJpaRepositories(basePackages= {"com.springboot.beginner.repository"})
@EntityScan(basePackages= {"com.springboot.beginner.entity"})
@EnableCaching
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}

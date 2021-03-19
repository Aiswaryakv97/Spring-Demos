package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan( "com.example.*" )
@EnableJpaRepositories(basePackages = "com.example.*")
@EntityScan(basePackages = "com.example.*")
@SpringBootApplication
public class SpringBootjpaCrud1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootjpaCrud1Application.class, args);
	}

}

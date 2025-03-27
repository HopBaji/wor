package com.example.solarv2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.solarv2"})
public class Solarv2Application {

	public static void main(String[] args) {

		SpringApplication.run(Solarv2Application.class, args);

	}

}

package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class MsFeignProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsFeignProducerApplication.class, args);
	}

}

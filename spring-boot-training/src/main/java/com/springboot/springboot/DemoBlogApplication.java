package com.springboot.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
//import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class DemoBlogApplication {

//	@Bean
//	public RestTemplate restTemplate() {
//		return new RestTemplate();
//	}

	public static void main(String[] args) {
		SpringApplication.run(DemoBlogApplication.class, args);
	}
}

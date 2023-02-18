package com.project.randomordergenerator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class RandomOrderGeneratorApplication {

	public static void main(String[] args) {
		SpringApplication.run(RandomOrderGeneratorApplication.class, args);
	}

}

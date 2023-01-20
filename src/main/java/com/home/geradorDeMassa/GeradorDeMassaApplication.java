package com.home.geradorDeMassa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableFeignClients
@SpringBootApplication
@EnableScheduling
public class GeradorDeMassaApplication {

	public static void main(String[] args) {
		SpringApplication.run(GeradorDeMassaApplication.class, args);

	}
}

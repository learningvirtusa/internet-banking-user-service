package com.core.banking.user.service.internetbankinguserservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableEurekaClient
public class InternetBankingUserServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InternetBankingUserServiceApplication.class, args);
	}

}

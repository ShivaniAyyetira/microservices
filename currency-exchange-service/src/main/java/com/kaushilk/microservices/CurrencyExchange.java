package com.kaushilk.microservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CurrencyExchange {

	public static void main(String[] args) {
		SpringApplication.run(CurrencyExchange.class, args);
	}

}

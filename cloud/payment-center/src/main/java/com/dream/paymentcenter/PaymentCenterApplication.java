package com.dream.paymentcenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class PaymentCenterApplication {

	public static void main(String[] args) {
		SpringApplication.run(PaymentCenterApplication.class, args);
	}

}

package com.algaworks.algadelivery.courier.management;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
public class CourierManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(CourierManagementApplication.class, args);
	}

}

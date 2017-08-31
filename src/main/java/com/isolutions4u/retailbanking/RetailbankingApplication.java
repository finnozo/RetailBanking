package com.isolutions4u.retailbanking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

@SpringBootApplication(exclude = HibernateJpaAutoConfiguration.class)
public class RetailbankingApplication {

	public static void main(String[] args) {
		SpringApplication.run(RetailbankingApplication.class, args);
	}
}

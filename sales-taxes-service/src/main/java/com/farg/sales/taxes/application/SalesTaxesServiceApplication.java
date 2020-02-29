package com.farg.sales.taxes.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan("com.farg.*")
@EnableJpaRepositories("com.farg.sales.taxes.repository")
@EntityScan("com.farg.sales.taxes.model")
@SpringBootApplication
public class SalesTaxesServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SalesTaxesServiceApplication.class, args);
	}

}

package com.anz.assessment.accountTransaction.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan({ "com.anz.assessment.accountTransaction" })
@SpringBootApplication
public class AccountTransactionApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountTransactionApplication.class, args);
	}

}

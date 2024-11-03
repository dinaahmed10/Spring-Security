package com.springsecuritycourse.springsection1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan("com.springsecuritycourse.springsection1.contoller")
public class EsayBankBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(EsayBankBackendApplication.class, args);
	}

}

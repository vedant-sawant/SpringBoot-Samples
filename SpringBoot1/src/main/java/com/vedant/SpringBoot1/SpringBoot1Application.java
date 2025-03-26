package com.vedant.SpringBoot1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/*
  🔥 Spring Boot Autowiring Types: @Autowired Field, Constructor & Setter Injection 🔥
 */
@SpringBootApplication
public class SpringBoot1Application {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(SpringBoot1Application.class, args);
		Employee emp=context.getBean(Employee.class);
		emp.show();

		System.out.println("Hello People");
	}

}

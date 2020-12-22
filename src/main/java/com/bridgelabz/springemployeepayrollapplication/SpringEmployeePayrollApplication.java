package com.bridgelabz.springemployeepayrollapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class SpringEmployeePayrollApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringEmployeePayrollApplication.class, args);
		log.info("Employee Payroll app started in {} Environment", context.getEnvironment().getProperty("environment"));
		log.info("Employee Payroll DB User is {} ", context.getEnvironment().getProperty("spring.datasouce.username"));

	}

}

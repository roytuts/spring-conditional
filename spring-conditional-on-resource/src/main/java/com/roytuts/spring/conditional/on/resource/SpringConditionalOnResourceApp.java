package com.roytuts.spring.conditional.on.resource;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringConditionalOnResourceApp implements CommandLineRunner {

	@Autowired
	private ApplicationContext applicationContext;

	public static void main(String[] args) {
		SpringApplication.run(SpringConditionalOnResourceApp.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		String[] beans = applicationContext.getBeanDefinitionNames();

		Arrays.sort(beans);

		boolean contains = Arrays.stream(beans).anyMatch("log4j"::equalsIgnoreCase);

		if (contains) {
			System.out.println("Log4j loaded");
		} else {
			System.out.println("Log4j not loaded");
		}
	}

}

package com.roytuts.spring.conditional.on.expression;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringConditionalOnExpressionApp implements CommandLineRunner {

	@Autowired
	private ApplicationContext applicationContext;

	public static void main(String[] args) {
		SpringApplication.run(SpringConditionalOnExpressionApp.class, args).close();
	}

	@Override
	public void run(String... args) throws Exception {
		String[] beans = applicationContext.getBeanDefinitionNames();
		Arrays.sort(beans);

		boolean contains = Arrays.stream(beans).anyMatch("module"::equalsIgnoreCase);

		if (contains) {
			System.out.println("Module loaded");
		} else {
			System.out.println("Module not loaded");
		}
	}

}

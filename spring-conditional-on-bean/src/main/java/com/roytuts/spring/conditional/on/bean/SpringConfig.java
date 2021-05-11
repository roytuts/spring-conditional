package com.roytuts.spring.conditional.on.bean;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.SearchStrategy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

	@Bean
	// @ConditionalOnBean(value = RequiredBean.class)
	// @ConditionalOnBean(name = "requiredBean")
	// @ConditionalOnBean(name = { "requiredBean", "anotherRequiredBean" })
	// @ConditionalOnBean(type =
	// "com.roytuts.spring.conditional.on.bean.RequiredBean")
	@ConditionalOnBean(search = SearchStrategy.CURRENT, type = "com.roytuts.spring.conditional.on.bean.RequiredBean")
	public SpringService springService() {
		return new SpringService();
	}

}
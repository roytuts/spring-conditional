package com.roytuts.spring.conditional.on.resource;

import org.springframework.boot.autoconfigure.condition.ConditionalOnResource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnResource(resources = { "log4j.properties" })
class SpringConfig {

	@Bean
	public Log4j log4j() {
		return new Log4j();
	}

}
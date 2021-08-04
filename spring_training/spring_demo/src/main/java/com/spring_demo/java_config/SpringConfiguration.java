package com.spring_demo.java_config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;

@Configuration
public class SpringConfiguration {
	
	@Bean
	public Train train() {
		return new Train();
	}
	
	@Bean
	public Passanger passanger(long pnr, String name) {
		return new Passanger(pnr, name);
	}
	
}
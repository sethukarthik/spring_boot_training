package com.spring_demo.properties_demo;

import javax.inject.Inject;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:price.properties")
@PropertySource("classpath:price2.properties")
public class AppConfig {
	
	@Inject
	Environment env;
	
	@Bean
	public Product product() {
		Product product = new Product();
		String sp = env.getProperty("shampoo", String.class);
		product.setName(sp);
		product.setPrice(200);
		
		return product;
	}
}

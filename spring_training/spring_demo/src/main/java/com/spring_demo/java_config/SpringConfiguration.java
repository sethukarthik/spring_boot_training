package com.spring_demo.java_config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;

@Configuration
public class SpringConfiguration {
	
	@Bean
	public Train train() {
		System.out.println("1");
		return new Train();
	}
	
	@Bean
	public Train train(int trainCode, String trainName, Passanger passanger) {
		System.out.println("2");
		return new Train(trainCode, trainName, passanger);
	}
	
	@Bean
	public Passanger passanger(long pnr, String name) {
		System.out.println("3");
		return new Passanger(pnr, name);
	}
	
	@Bean
	public Passanger passanger() {
		System.out.println("4");
		return new Passanger();
	}
	
}
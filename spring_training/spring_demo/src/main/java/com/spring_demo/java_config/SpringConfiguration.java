package com.spring_demo.java_config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Scope;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;

@Configuration
//@ImportResource({"maven_demo.xml","inventory_main.xml"})
public class SpringConfiguration {
	
	@Bean
	@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE) //The prototype
	public Train train() {
		return new Train();
	}
	
//	This is not the right way of doing
//	@Bean
//	public Train train(int trainCode, String trainName, passenger passenger) {
//		System.out.println("2");
//		return new Train(trainCode, trainName, passenger);
//	}
//	
//	Instead of this we can call this constructor from another constructor
//	@Bean
//	public Passenger passenger(long pnr, String name) {
//		System.out.println("3");
//		return new Passenger(pnr, name);
//	}
	
	@Bean
	public Passanger passanger() {
		return new Passanger();
	}
	
}
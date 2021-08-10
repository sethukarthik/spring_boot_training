package com.spring_demo.lifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;

public class SecondBeanPostProcessorDemo implements BeanPostProcessor, Ordered{
	
	public Object postProcessAfterInitialization(Object arg0, String name) throws BeansException {
		System.out.println("SecondBeanPostProcessorDemo::PostProcessorAfterInitialization::"+ name);
		return null;
	}
	
	public Object postProcessBeforeInitialization(Object arg0, String name) throws BeansException {
		System.out.println("SecondBeanPostProcessorDemo::PostProcessorBeforeInitialization::"+ name);
		return null;
	}
	
	@Override
	public int getOrder() {
		return Ordered.HIGHEST_PRECEDENCE;
	}
}

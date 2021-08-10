package com.spring_demo.lifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
public class SecondBeanPostProcessorDemo implements BeanPostProcessor{
	
	public Object postProcessAfterInitialization(Object arg0, String name) throws BeansException {
		System.out.println("SecondBeanPostProcessorDemo::PostProcessorAfterInitialization::"+ name);
		return null;
	}
	
	public Object postProcessBeforeInitialization(Object arg0, String name) throws BeansException {
		System.out.println("SecondBeanPostProcessorDemo::PostProcessorBeforeInitialization::"+ name);
		return null;
	}
}

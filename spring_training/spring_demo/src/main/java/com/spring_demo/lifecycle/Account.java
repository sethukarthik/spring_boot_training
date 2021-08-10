package com.spring_demo.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Inject;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Account implements ApplicationContextAware, BeanNameAware, InitializingBean, DisposableBean { //we can implement ApplicationContextAware using annotation
//public class Account implements BeanNameAware {
 
	private Customer customer;
	private long accNum;
	@Inject
	private ApplicationContextAware apc;

	public Account(Customer customer, long accNum) {
		System.out.println("Account Constuctor with customer");
		this.customer = customer;
		this.accNum = accNum;
	}

	public Account() {
		System.out.println("Account::Constructor::Default");
	}

	@Override
	public String toString() {
		return "Account [customer=" + customer + "]";
	}

	public Customer getCustomer() {
		return customer;
	}
	
	public void setCustomer(Customer customer) {
		System.out.println("Account::SetCustomer");
		this.customer = customer;
	}
	
	public long getAccNum() {
		return accNum;
	}

	public void setAccNum(long accNum) {
		System.out.println("Account::SetAccNum");
		this.accNum = accNum;
	}

	public void print() {
		customer.print();
		System.out.println("Account::PrintMethod::" + apc);
	}
	
	//	To execute this method we need to Implement ApplicationContextAware
	public void setApplicationContext(ApplicationContext appC) throws BeansException {
		System.out.println("Account::setApplicationContext::"+appC);
	}
	
	//This is derived from SetBeanName Interface
	//SetBeanName always execute first and then SetApplicationContext will execute.
	public void setBeanName(String name) {
		System.out.println("Account::SetBeanName::"+name);
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("Account::AfterPropertiesSet::UsingInterface");
	}
	
	@PostConstruct //For this we have to add one more dependencies in pom.xml
	public void afterPropertiesSetAnnotation() {
		System.out.println("Account::AfterPropertiesSet::Annotation");
	}
	
	public void afterPropertiesXML() {
		System.out.println("Account::AfterPropertiesSet::XML");
	}

	
	//These destroy methods only available by shutting down gracefully (.close())
	//If we don't have .close() in configuration the been will shut down forcefully and it won't available
	@Override
	public void destroy() throws Exception {
		System.out.println("Account::Destroy::Interface");
	}

	public void destroyXML() {
		System.out.println("Account::DestroyXML::XML");
	}
	
	@PreDestroy
	public void destroyAnnotation() {
		System.out.println("Account::DestroyAnnotation::Annotation");
	}
	
}

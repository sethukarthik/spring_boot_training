package com.spring_demo.lifecycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring_demo.java_config.Train;

public class ExcuteMavenDemo {

	public static void main(String[] args) {
		
		//This starts injecting the bean
		//In XML File if the bean doesn't have properties then the default constructor alone will execute else based on the property tag the setter method will execute
		//Printing from Customer::Constructor::Default
		//Printing from Account::Constructor::Default
		ClassPathXmlApplicationContext cpxac = new ClassPathXmlApplicationContext("lifecycle_executor.xml");
		Account account = cpxac.getBean("account", Account.class);
		account.print();
		cpxac.close();
	}
	
} 


/*
 * 
<bean id="customer" class="com.spring_demo.lifecycle.Customer">
	<property name="userId" value="1"></property>
	<property name="userName" value="MavenUser"></property>
</bean>

<!-- We can use either Id or Name attribute -->
<bean name="account" class="com.spring_demo.lifecycle.Account">
	<property name="accNum" value="123654789"></property>
	<property name="customer">
		<ref bean="customer"/>
	</property>
</bean>
Customer::Constructor::Default
Customer::SetUserId
Customer::SetUserName
Customer::SetBeanName::customer
Account::Constructor::Default
Account::SetAccNum
Account::SetCustomer

------- ***** -------
<bean name="account" class="com.spring_demo.lifecycle.Account">
	<property name="accNum" value="123654789"></property>
	<property name="customer">
		<ref bean="customer"/>
	</property>
</bean>

<bean id="customer" class="com.spring_demo.lifecycle.Customer">
	<property name="userId" value="1"></property>
	<property name="userName" value="MavenUser"></property>
</bean>

Account::Constructor::Default
Customer::Constructor::Default
Customer::SetUserId
Customer::SetUserName
Customer::SetBeanName::customer
Account::SetAccNum
Account::SetCustomer
Account::SetBeanName::account

*
*
*/
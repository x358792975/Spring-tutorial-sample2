package com.myspring.aop.impl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		ArithmaticCalculator arithmaticCalculator = context.getBean(ArithmaticCalculator.class);
		
		int result = arithmaticCalculator.add(3, 6);
		
		System.out.println("Result --> " + result);
		

		result = arithmaticCalculator.div(12, 6);
		
		System.out.println("Result --> " + result);
		
		
	}

}

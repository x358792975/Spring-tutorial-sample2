package com.myspring.aop.helloworld;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ArithmaticCalculator arithmaticCalculator = null;
		//arithmaticCalculator = new ArithmaticCalculatorLoggingImpl();
		
		ArithmaticCalculator target = new ArithmaticCalculatorImpl();
		ArithmaticCalculator proxy = new ArithmeticCalculatorLoggingProxy(target).getLoggingProxy();
		
		int result1 = proxy.add(1, 2);
		System.out.println("Result1 -->  "+ result1);
		int result2 = proxy.div(4, 2);
		System.out.println("Result2 -->  "+ result2);
		
	}

}

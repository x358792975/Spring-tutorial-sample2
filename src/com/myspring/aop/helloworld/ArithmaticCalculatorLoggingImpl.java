package com.myspring.aop.helloworld;

public class ArithmaticCalculatorLoggingImpl implements ArithmaticCalculator {

	public int add(int i, int j) {
		System.out.println("Begin with Add " + i + " and " + j);
		int result = i+j;
		System.out.println("End with "+ result);
		return result;
	}

	public int sub(int i, int j) {
		System.out.println("Begin with Sub " + i + " and " + j);
		int result = i-j;
		System.out.println("End with "+ result);
		return result;
	}

	public int mul(int i, int j) {
		System.out.println("Begin with Mul " + i + " and " + j);
		int result = i * j;
		System.out.println("End with "+ result);
		return result;
	}

	public int div(int i, int j) {
		System.out.println("Begin with Div " + i + " and " + j);
		int result = i/j;
		System.out.println("End with "+ result);
		return result;
	}

}

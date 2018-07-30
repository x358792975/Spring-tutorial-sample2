package com.myspring.aop.helloworld;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

//动态代理
public class ArithmeticCalculatorLoggingProxy {
	private ArithmaticCalculator target;
	
	public ArithmeticCalculatorLoggingProxy(ArithmaticCalculator target) {
		this.target = target;
		// TODO Auto-generated constructor stub
	}
	
	public ArithmaticCalculator getLoggingProxy() {
		ArithmaticCalculator proxy = null;
		
		//代理对象由哪一个类加载器负责加载
		ClassLoader loader = target.getClass().getClassLoader();
		//代理对象的类型， 即其中有哪些方法
		Class[] interfaces = new Class[] {ArithmaticCalculator.class};
		//当调用代理对象其中的方法时， 该执行的代码
		InvocationHandler h = new InvocationHandler() {
			/**
			 * 
			 */
			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				// TODO Auto-generated method stub
				String methodName = method.getName();
				//日志
				System.out.println("The method is -->   " + methodName + " begins with " + Arrays.asList(args));
				//执行方法
				Object result = method.invoke(target, args);
				//日志
				System.out.println("The method is -->   \" + methodName + \" ends with \" + Arrays.asList(args)");
				return result;
			}
		};
		proxy = (ArithmaticCalculator) Proxy.newProxyInstance(loader, interfaces, h);
		
		return proxy;
	}
	
}

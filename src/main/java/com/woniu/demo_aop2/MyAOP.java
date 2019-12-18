package com.woniu.demo_aop2;

import org.aspectj.lang.ProceedingJoinPoint;
public class MyAOP {

	/*
	 * public void before() { System.out.println("MyAOP.before()999"); }
	 * 
	 * public void after() { System.out.println("MyAOP.after()999"); }
	 * 
	 * public void afterThrowing() { System.out.println("MyAOP.afterThrowing()999");
	 * }
	 * 
	 * public void afterReturning() {
	 * System.out.println("MyAOP.afterReturning()999"); }
	 */
	
	public Object around(ProceedingJoinPoint poj) throws Throwable {
		System.out.println("MyAOP.around()");
		Object proceed = null; //proceed是执行方法后的返回值
		try {
			System.out.println("MyAOP.before()111");
			proceed = poj.proceed();
			System.out.println("afterReturning()111");
		} catch (Exception e) {
			System.out.println("MyAOP.afterThrowing()111");
			e.printStackTrace();
		}finally {
			System.out.println("after()111");
		}
		return proceed;
	}
}

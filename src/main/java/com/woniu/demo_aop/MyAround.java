package com.woniu.demo_aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAround {

	@Pointcut("execution(* com.woniu.demo_aop..*.*(..))")
	public void pointCut() {}
	
	@Around("pointCut()")
	public Object around(ProceedingJoinPoint poj) throws Throwable {
		Object proceed = null; //proceed是执行方法后的返回值
		try {
			System.out.println("MyAOP.before()");
			proceed = poj.proceed();
			System.out.println("afterReturning()");
		} catch (Exception e) {
			System.out.println("MyAOP.afterThrowing()");
			e.printStackTrace();
		}finally {
			System.out.println("after()");
		}
		return proceed;
	}
}

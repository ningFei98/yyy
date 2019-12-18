package com.woniu.demo_aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
@Aspect
@Component
public class MyAOP {
	@Pointcut("execution(* com.woniu.demo_aop..*.*(..))")
	public void pointCut() {
		
	}
	@Before("pointCut()")
	public void before() {
		System.out.println("MyAOP.before()");
	}
	
	@After("pointCut()")
	public void after() {
		System.out.println("MyAOP.after()");
	}
	
	@AfterThrowing("pointCut()")
	public void afterThrowing() {
		System.out.println("MyAOP.afterThrowing()");
	}
	
	@AfterReturning("pointCut()")
	public void afterReturning() {
		System.out.println("MyAOP.afterReturning()");
	}
}

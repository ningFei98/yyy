package com.woniu.work1;

public class TargetObject {

	public void method1() {
		System.out.println("TargetObject.method1()");
	}

	public void method2() {
		System.out.println("TargetObject.method2()");
	}

	@Override
	public String toString() {
		System.out.println("TargetObject.toString()");
		return "TargetObject []" + getClass();
	}

}

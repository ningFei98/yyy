package com.woniu.work1;

import net.sf.cglib.proxy.Enhancer;

public class TestCglib {
	public static void main(String[] args) {
		System.out.println(TargetObject.class);
		Enhancer enhancer =new Enhancer();
		//将被代理类TargetObject设置成父类
        enhancer.setSuperclass(TargetObject.class);
        //设置拦截器TargetInterceptor
        enhancer.setCallback(new TargetInterceptor());
        //执行enhancer.create()动态生成一个代理类,并从Object强制转型成父类型TargetObject
        TargetObject targetObject2=(TargetObject)enhancer.create();
        //代理类上调用方法
        targetObject2.method1();
        targetObject2.method2();
        
        System.out.println(targetObject2);
	}

}

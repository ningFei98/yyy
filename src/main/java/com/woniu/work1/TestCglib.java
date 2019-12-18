package com.woniu.work1;

import net.sf.cglib.proxy.Enhancer;

public class TestCglib {
	public static void main(String[] args) {
		System.out.println(TargetObject.class);
		Enhancer enhancer =new Enhancer();
		//����������TargetObject���óɸ���
        enhancer.setSuperclass(TargetObject.class);
        //����������TargetInterceptor
        enhancer.setCallback(new TargetInterceptor());
        //ִ��enhancer.create()��̬����һ��������,����Objectǿ��ת�ͳɸ�����TargetObject
        TargetObject targetObject2=(TargetObject)enhancer.create();
        //�������ϵ��÷���
        targetObject2.method1();
        targetObject2.method2();
        
        System.out.println(targetObject2);
	}

}

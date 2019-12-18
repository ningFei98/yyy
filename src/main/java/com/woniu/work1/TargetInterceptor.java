package com.woniu.work1;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
/**
 * Ŀ�������������ʵ��MethodInterceptor
 * @author 12168
 *
 */
public class TargetInterceptor implements MethodInterceptor {

	/**
	 * ��д���������ڷ���ǰ�ͷ��������ҵ��
     * Object objΪĿ�����
     * Method methodΪĿ�귽��
     * Object[] params Ϊ������
     * MethodProxy proxy CGlib�����������
	 */
	@Override
	public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
		
		System.out.println("����ǰ");
        Object result = proxy.invokeSuper(obj, args);
        System.out.println("���ú�");
        return result;
	}

}

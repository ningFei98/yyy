package com.woniu.work1;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
/**
 * 目标对象拦截器，实现MethodInterceptor
 * @author 12168
 *
 */
public class TargetInterceptor implements MethodInterceptor {

	/**
	 * 重写方法拦截在方法前和方法后加入业务
     * Object obj为目标对象
     * Method method为目标方法
     * Object[] params 为参数，
     * MethodProxy proxy CGlib方法代理对象
	 */
	@Override
	public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
		
		System.out.println("调用前");
        Object result = proxy.invokeSuper(obj, args);
        System.out.println("调用后");
        return result;
	}

}

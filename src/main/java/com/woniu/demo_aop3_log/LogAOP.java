package com.woniu.demo_aop3_log;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAOP {
	@Pointcut("execution(* com.woniu.demo_aop3_log..*.*(..))")
	public void pc() {
		
	}

	@Around("pc()")
	public Object around(ProceedingJoinPoint poj){
		StringBuffer strB = new StringBuffer();
		strB.append("==================================\r\n");
		strB.append("游客");
		strB.append("时间" + new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date()) + "\r\n");
		strB.append("访问了：" + poj.getTarget() + ":" + poj.getSignature().getName() + "\r\n");
		strB.append("==================================\r\n");
		File file = new File("d:/logs.txt");
		try {
			FileWriter fw = new FileWriter(file,true);
			fw.write(strB.toString());
			fw.flush();
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Object obj = null;
		try {
			obj = poj.proceed();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return obj;
	}
}

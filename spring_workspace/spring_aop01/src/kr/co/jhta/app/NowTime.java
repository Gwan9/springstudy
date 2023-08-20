package kr.co.jhta.app;

import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.aop.BeforeAdvice;
import org.springframework.aop.MethodBeforeAdvice;

public class NowTime implements MethodBeforeAdvice {
	
	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		String nt = sdf.format(d);
		System.out.println("현재시간  " + nt);
	}
	
}

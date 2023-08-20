package kr.co.jhta.app;

import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.aop.MethodBeforeAdvice;

public class HijackBeforeAdvice implements MethodBeforeAdvice {

	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		
		System.out.println("공통 관심사 업무(부가기능)을 지정");
		System.out.println("메서드가 실행되기 전에 가로채기");
		
	}
	
}

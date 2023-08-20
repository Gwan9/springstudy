package kr.co.jhta.app;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.util.StopWatch;

public class CheckTime implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		
		// 시간측정
		StopWatch sw = new StopWatch(); 
		// 시작
		sw.start();
		
		Object obj = invocation.proceed(); // 원래 처리하려던 메서드를 실행
		
		
		sw.stop();
		
		System.out.println("진행시간 : " + sw.getTotalTimeSeconds() + "초 ");
		
		return obj;
	}

	
}

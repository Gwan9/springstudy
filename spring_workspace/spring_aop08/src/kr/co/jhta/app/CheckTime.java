package kr.co.jhta.app;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.util.StopWatch;

public class CheckTime {

	public Object logAround(ProceedingJoinPoint pjp) throws Throwable {
		
		String methodName = pjp.getSignature().getName();
		
		System.out.println("실행중인 메서드 : " + methodName);
		
		StopWatch sw = new StopWatch();
		
		sw.start();
		
		
		Object obj = pjp.proceed();
		
		sw.stop();
		
		
		System.out.println("진행시간 : " + sw.getTotalTimeSeconds() + "초" );
		
		return obj;
	}

}

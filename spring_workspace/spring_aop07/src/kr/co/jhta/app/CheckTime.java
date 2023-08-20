package kr.co.jhta.app;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.util.StopWatch;

public class CheckTime {
	
	public Object logAround(ProceedingJoinPoint php) throws Throwable {
		
		String methodName = php.getSignature().getName();
		
		System.out.println("실행중인 메서드명 : " + methodName);
		
		StopWatch sw = new StopWatch();
		
		sw.start();
		
		Object obj = php.proceed();
		
		sw.stop();
		
		System.out.println("실행시간 : " + sw.getTotalTimeSeconds() + "초");
		return obj;
		
	}
	
}

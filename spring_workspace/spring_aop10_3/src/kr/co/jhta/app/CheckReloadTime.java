package kr.co.jhta.app;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.util.StopWatch;

@Aspect
public class CheckReloadTime  {

	@Pointcut("execution (public void reload(..))")
	public void publicTarget() {}
	
	@Around("publicTarget()")
	public Object logAround(ProceedingJoinPoint pjp)throws Throwable {
		
		StopWatch sw = new StopWatch();
		
		sw.start();
		
		Object obj = pjp.proceed();
		
		sw.stop();
		System.out.println("실행시간 : " + sw.getTotalTimeSeconds()+"초");
		
		
		
		return obj;
		
		
	}
}

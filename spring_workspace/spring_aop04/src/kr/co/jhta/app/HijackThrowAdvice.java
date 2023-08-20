package kr.co.jhta.app;

import org.springframework.aop.ThrowsAdvice;

public class HijackThrowAdvice implements ThrowsAdvice{
	public void afterThrowing(IllegalArgumentException e) {
		System.out.println("hijact Throw Exception");
	}
}

package kr.co.jhta.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

	public static void main(String[] args) {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("app.xml");
		
		Bank bi = ac.getBean("bi", Bank.class);
		
		bi.transfer(10000); // 
		
		
		// 이체 작업이 끝나면 이체 정보를 파일에 저장
		// LogingAdvice.java
		// d:\log\log날짜 log 파일을 생성
		// 파일에 내용을 기록 2023년 6월 20일 15시 30 분 3초에 이체함
		
	}

}

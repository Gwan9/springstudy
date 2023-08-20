package kr.co.jhta.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

	public static void main(String[] args) {

		ApplicationContext ac = new ClassPathXmlApplicationContext("app.xml");
		
		HelloInter h = ac.getBean("imple", HelloInter.class);
		
		h.sayHello("홍길동");
				
	}

}

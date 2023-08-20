package kr.co.jhta.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
	public static void main(String[] args) {
		
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("application.xml");
		
		Message m = ac.getBean("ms", Message.class);
		
		m.printMsg();
		try {
			m.printThrowsException();
		}catch(IllegalArgumentException e) {
			
		}
	}
}

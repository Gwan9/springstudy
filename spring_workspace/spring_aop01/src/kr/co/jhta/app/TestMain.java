package kr.co.jhta.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("app.xml");
		
		CustomerService cs = ac.getBean("cs", CustomerService.class);
		
		cs.printName(); // 당신의 이름 : 홍길동
		
		
		cs.printEmail(); // 당신의 이메일 : hong@gmail.com
		
	}

}

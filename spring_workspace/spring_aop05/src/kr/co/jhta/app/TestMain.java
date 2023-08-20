package kr.co.jhta.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

	public static void main(String[] args) {


		// 당신의 이름 : GH
		// 당신의 email : GH@gmail.com
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("app.xml");
		
		CustomerService cs = ac.getBean("cs", CustomerService.class);
		
		cs.printName();
		
		cs.printEmail();
	}

}

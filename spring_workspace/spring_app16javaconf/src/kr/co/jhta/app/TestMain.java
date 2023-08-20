package kr.co.jhta.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ApplicationContext ac = new ClassPathXmlApplicationContext("app.xml");
		
		ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Hello h = ac.getBean("h", Hello.class);
		
		h.sayHello("아기상어");
		
	}

}

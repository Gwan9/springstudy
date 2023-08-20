package kr.co.jhta.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;




public class TestMain {

	public static void main(String[] args) {


		ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Printer p = factory.getBean("p", Printer.class);
		
		
		
		p.print("어흑...");
	}
	

}

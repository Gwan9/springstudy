package kr.co.jhta.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

	public static void main(String[] args) {
		// 1. xml  2. AutoWired   3. javaConfig

//		ApplicationContext ac = new ClassPathXmlApplicationContext("app.xml");
		ApplicationContext ac = new AnnotationConfigApplicationContext(Config.class);
		Airplain a = ac.getBean("B737", Airplain.class);
		Airplain b = ac.getBean("F35", Airplain.class);
		
		a.takeoff();
		a.landing();
		a.fly();
		
//		b.takeoff();
//		b.landing();
//		b.fly();
		
		
	}

}

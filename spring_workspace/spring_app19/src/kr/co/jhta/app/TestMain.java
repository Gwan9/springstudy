package kr.co.jhta.app;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

	public static void main(String[] args) {
		
		// app.xml 을 읽어들여 스프링 컨테이너를 구성
		
		BeanFactory factory;
		ApplicationContext ac = new ClassPathXmlApplicationContext("app.xml");
		
		// 'm'이라는 이름의 객체를 인터페이스형으로 리턴
		Message m = ac.getBean("m", Message.class);
		
		// printMsg() 호출
		
		m.printMsg();
		
		AbstractApplicationContext aac = (AbstractApplicationContext)ac;
		System.out.println("현재 컨테이너 닫기");
		aac.close();
	}

}

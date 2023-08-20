package kr.co.jhta.app;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
	public static void main(String[] args) {
		// BeanFacotory
		
		//BeanFactory factory;
		ApplicationContext ac = new ClassPathXmlApplicationContext("app.xml"); // ClassPath -> src 연결, app.xml만 쓰면 됨
		
		// 인터페이스(Character)를 사용해야 범용성이 높음
		// Police를 사용하면 다른 캐릭터를 사용 X
		Character c = ac.getBean("c", Character.class);
		
		c.walk();
		c.eat("도넛");
		c.attack("도넛");
		c.get("500원");
		// 빈 관리기능
		// 자원처리 추상화
		// 메세지 지원 및 국제화 지원
		// 이벤트 지원
		
	}
}

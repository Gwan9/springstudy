package kr.co.jhta.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

	public static void main(String[] args) {
		// 1. reload() 를 수행시 걸리는 시간을 측정하고자한다. 

		// 시간을 측청하기위해  CheckReloadTime 클래스를 작성하고  AOP 설정(3가지 방법으로) 하고 실행시켜보세요 

		
		ApplicationContext ac = new ClassPathXmlApplicationContext("app.xml");
		
		Weapon w = ac.getBean("w", Weapon.class);
		
		w.fire();
		
		w.reload();
	}

}

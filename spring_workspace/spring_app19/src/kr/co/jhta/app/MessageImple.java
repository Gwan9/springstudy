package kr.co.jhta.app;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javafx.fxml.Initializable;

public class MessageImple implements Message, InitializingBean, DisposableBean{
	String name;
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public void printMsg() {
		System.out.println( name + "님 환영합니다");
		
	}
	@Override
	public void destroy() throws Exception {
		System.out.println("DisposableBean 구현메서드 : 종료메서드");
		
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("InitializingBean 구현메서드 : 초기화 메서드");
		
	}

}

package kr.co.jhta.app;

public class MessageImple2 implements Message {

	String name;
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public void printMsg() {
		System.out.println( name + "님 환영합니다");
		
	}
	
	// 초기화 메소드 커스텀
	public void init() {
		System.out.println("사용자 정의형 초기화 메소드");
	}
	
	// 종료 메소드 커스텀
	public void destroy() {
		System.out.println("사용자 정의형 종료 메소드");
	}
	
	
	
}

package kr.co.jhta.app;

import org.springframework.beans.factory.annotation.Autowired;

public class HelloImple implements HelloInter {
	
	@Autowired // 필요한 의존 객체의 "Type"에 해당하는 빈을 찾아서 주입한다. 생성자, 멤버필드, 세터에 사용가능
	NowTime nt;
	
	public void setNt(NowTime nt) {
		this.nt = nt;
	}
	
	
	public HelloImple() {}
	
	
	public HelloImple(NowTime nt) {
		super();
		this.nt = nt;
	}
	@Override
	public void sayHello(String name) {
		System.out.println("Hello : " + name + " : ");
		
	}
	
}

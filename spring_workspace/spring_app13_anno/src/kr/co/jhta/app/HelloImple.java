package kr.co.jhta.app;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;

public class HelloImple implements HelloInter {
	// 생성자 : 객체를 초기화하기 위해서, 주로 멤버변수의 값들을 초기화, 
	// 생성자가 하나도 존재 X -> 기본생성자가 있는것으로 간주
	// 생성자가 존재한다면 -> 기본생성자를 만들어줘야함
	@Autowired
	NowTime nt;
	
	public HelloImple() {
		
	}
	// 매개변수 있는 생성자를 통해서 NowTime 참조값을 값을 전달할 수 있음
//	public HelloImple(NowTime nt) {
//		super();
//		this.nt = nt;
//		// 멤버변수의 값 = 기본 값
//		// nt = null;
//	}
	
	// setter
	public void setNt(NowTime nt) {
		this.nt = nt;
	}

	@Override
	public void sayHello(String name) {
		// 6~10시 : 안녕하세요
		// 10~15시 : 점심식사 하셨어요?
		// 15~ : 좋은 저녁시간되세요
		NowTime nt = new NowTime();
		
		int hour = nt.getHours();
		
		System.out.println( "현재시간은 " + hour + "시 입니다." );
		
		if( hour>6 && hour<10) {
			System.out.println( name + "님 안녕하세요" );
		}else if ( hour>10 && hour<15 ) {
			System.out.println( name + "님 점심식사 하셨어요?" );
		}else {
			System.out.println( name + "님 좋은 저녁시간 되세요");
		}
		
	}

}

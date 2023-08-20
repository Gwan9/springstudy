package kr.co.jhta.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import lombok.Setter;

// Airplain 구현체

@Setter
public class Boeing737 implements Airplain {
	//setter DI
	@Autowired
	private Missile m;
	
	@Override
	public void takeoff() {
		System.out.println("이륙");
		
	}

	@Override
	public void landing() {
		System.out.println("착륙");
	}

	@Override
	public void fly() {
		System.out.println("비행");
		
	}
	public Boeing737() {
		
	}
	public Boeing737(Missile m) {
		super();
		this.m = m;
	}
	
	
}

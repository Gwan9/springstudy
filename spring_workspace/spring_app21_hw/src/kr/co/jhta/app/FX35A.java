
package kr.co.jhta.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import lombok.Setter;

@Setter
public class FX35A implements Airplain {
	
	
	@Autowired
	private Missile m;
	//setter DI
	
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
	public FX35A() {
	}
	
	public FX35A(Missile m) {
		super();
		this.m = m;
	}

	
	
}

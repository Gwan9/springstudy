package kr.co.jhta.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Firefighter implements Character {
	
	@Autowired
	@Qualifier("fire")
	Weapon w;
	
	
	
	@Override
	public void walk() {
		System.out.println("firefighter walk");
		
	}

	@Override
	public void eat(String it) {
		System.out.println(it + "먹어요");
		
	}

	@Override
	public void attack(Object obj) {
		System.out.println(obj + "firefighter");
	}

	@Override
	public void get(Object obj) {
		System.out.println(obj + "아이템을 획득");
		
	}
	
}

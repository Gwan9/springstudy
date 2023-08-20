package kr.co.jhta.app;

import org.springframework.beans.factory.annotation.Autowired;

public class Police implements Character {
	
	@Autowired
	Weapon w;
	
	
	public void setW(Weapon w) {
		this.w = w;
	}

	@Override
	public void walk() {
		System.out.println("뚜벅 뚜벅 걸어요");
		
	}

	@Override
	public void eat(String it) {
		System.out.println(it + ", 먹어요");
		
	}
	public Police() {}
	


	@Override
	public void attack(Object obj) {
		w.use();
		System.out.println(obj + ", 공격합니다");
	}

	@Override
	public void get(Object obj) {
		System.out.println(obj + " 아이템을 획득합니다");
		
	}

}

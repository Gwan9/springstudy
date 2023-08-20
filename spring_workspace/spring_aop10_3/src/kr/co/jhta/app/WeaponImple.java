package kr.co.jhta.app;

import lombok.Setter;

@Setter
public class WeaponImple implements Weapon {
	
	
	String type;
	
	
	@Override
	public void fire() {
		System.out.println(type + "공격");
		
	}

	@Override
	public void reload() {
		System.out.println(type + "재장전");
		
	}

}

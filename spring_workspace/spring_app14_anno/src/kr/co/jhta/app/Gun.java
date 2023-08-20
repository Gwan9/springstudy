package kr.co.jhta.app;

public class Gun implements Weapon{
	public void fire() {
		System.out.println("빵");
	}
	
	public void reload() {
		System.out.println("리로드~");
	}

	@Override
	public void use() {
		fire();
		
	}

	@Override
	public void reuse() {
		reload();
		
		
	}
}

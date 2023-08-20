package kr.co.jhta.app;

public class SlingShot implements Weapon {
	
	@Override
	public void use() {
		System.out.println("동맹이 던지는 중");
		
	}

	@Override
	public void reuse() {

		System.out.println("돌맹이 주워 오는 중");
	}

}

package kr.co.jhta.app;

import lombok.Setter;

@Setter
public class CustomerServiceImple implements CustomerService {
	String name;
	String email;
	@Override
	public void printName() {
		//예전에 쓰던 방식
//		long startTime = System.currentTimeMillis();
		System.out.println("당신의 이름 : " + name);
		
//		long endTime= System.currentTimeMillis();
//		long result = endTime - startTime;
//		System.out.println("result : " + result);
		
	}

	@Override
	public void printEmail() {
		// 2초간 슬립
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("당신의 이메일 : " + email);
		
	}

}

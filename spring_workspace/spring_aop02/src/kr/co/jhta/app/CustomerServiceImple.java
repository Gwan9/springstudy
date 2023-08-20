package kr.co.jhta.app;

import lombok.Setter;

@Setter
public class CustomerServiceImple implements CustomerService {
	String name;
	String email;
	@Override
	public void printName() {
		System.out.println("당신의 이름 : " + name);
		
	}

	@Override
	public void printEmail() {
		System.out.println("당신의 이메일 : " + email);
		
	}

}

package kr.co.jhta.app;

import lombok.Setter;

@Setter
public class BankImple implements Bank {
	
	String name;
	int balance;
	@Override
	public void transfer(int money) {
		System.out.println(name + "님 계좌에서" + money + "원이 이체되었습니다.");
		balance -= money;
		
		System.out.println("잔액 : " + balance);
		
	}

}

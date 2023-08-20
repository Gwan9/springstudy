package junitTest;

public class Calculator {
	
	public int sum(int num1, int num2) {
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return num1+num2;
		
		
	}
	
	public int minus(int num1,int num2) {
		return num1 - num2;
	}
}

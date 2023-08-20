package kr.co.jhta.app;

import lombok.Setter;

@Setter
public class MessageImple implements Message {
	String msg;
	@Override
	public void printMsg() {
		System.out.println("출력메세지 : " + msg );
		
	}

	@Override
	public void printThrowsException() {
		// 예외발생
		
		throw new IllegalArgumentException();
		
	}

}

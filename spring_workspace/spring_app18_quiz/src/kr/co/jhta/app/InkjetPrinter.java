package kr.co.jhta.app;

import org.springframework.beans.factory.annotation.Qualifier;

public class InkjetPrinter implements Printer {

	
	Printer p;
	@Override
	public void print(String msg) {
		System.out.println(msg + "Inkjet");
		
	}

}

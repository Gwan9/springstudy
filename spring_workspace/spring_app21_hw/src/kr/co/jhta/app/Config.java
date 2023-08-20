package kr.co.jhta.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

	
	@Bean(name="B737")
	public Airplain Boeing() {
		return new Boeing737();
	}
		
	@Bean(name="F35")
	public Airplain Fx() {
		return new FX35A();
	}
	
}

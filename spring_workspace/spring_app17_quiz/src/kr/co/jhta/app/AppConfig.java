package kr.co.jhta.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	
//	@Bean(name="imple")
//	public HelloInter hello() {
//		NowTime nt = new NowTime();
//		HelloImple hi = new HelloImple();
//		hi.setNt(nt);
//		return hi;
//	}
	@Bean(name="imple")
	public HelloInter hello() {
		return new HelloImple();
	}
	
	@Bean(name="nt")
	public NowTime getTime() {
		//NowTime nt = new NowTime();
		
		return new NowTime();
	}
	
	
}

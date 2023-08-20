package kr.co.jhta.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
// Bean에대한 정보를 가지고 있다는 의미의 어노테이션
@Configuration
public class AppConfig {
	
	
	@Bean(name="p")
	public Printer getLaserPrinter() {
		return new LaserPrinter();
	}
	@Bean(name="dot")
	public Printer getDotPrinter() {
		return new DotPrinter();
	}
	@Bean(name="ink")
	public Printer getInkjetPrinter() {
		return new InkjetPrinter();
	}
	
	
}

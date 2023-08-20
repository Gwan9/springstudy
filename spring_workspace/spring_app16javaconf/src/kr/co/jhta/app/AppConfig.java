package kr.co.jhta.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// 자바 클래스로 Bean 정보를 관리
// @Configuration : 설정정보를 가지고 있는 클래스
@Configuration
public class AppConfig {
	
	// <bean id="h" class="kr.co.jhta.app.HelloImple"></bean>
	
	@Bean(name="h")
	public Hello helloWorld() {
		return new HelloImple();
	}
}

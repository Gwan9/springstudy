package kr.co.jhta.web.control;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

// SLF4J
// logging 관련 라이브러리
// 여러 라이브러리들을 하나의 통일 된 방싱으로 사용할 수 있는 방법을 제공
// 로깅 Facade
// 추상 레이어를 제공하는 인터페이스 모듈
// logback 구현체

// logback

// logback.xml
// ConsoleAppender : 콘솔에 어떤 포맷으로 출력할 지 설정
// FileAppender : 파일에 어떤 포맷으로 출력할 지 설정

// 로그 레벨
// trace
// debug
// info
// warn
// error

@Controller
public class TestController {
	
	Logger logger = LoggerFactory.getLogger(TestController.class);
	
	
	@GetMapping("/test")
	public String test() {
		
		logger.info("로그기록생성중");
		String msg= "hahaha";
		logger.info("객체 정보 보기 : {}", msg);
		System.out.println("요기를 지나갔음~");
		
		return "test";
	}
}

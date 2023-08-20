package kr.co.jhta.web.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

	// GetMapping : get 방식으로 맵핑
	// PostMapping : post 방식으로 맵핑
	// RequestMapping : get + post
	@RequestMapping("/test.do")
	public String test() {
		
		
		
		return "test";
		
	}
}

package kr.co.jhta.web.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class TestController {
	
	@RequestMapping("/test.do")
	public String show() {
		return "test";
	}
}

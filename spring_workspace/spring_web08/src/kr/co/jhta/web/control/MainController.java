package kr.co.jhta.web.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

// main.do ===> main.jsp로 이동
// method 이름 : main()
@Controller
public class MainController {
	
	@RequestMapping("/main.do")
	public String main() {
		return "main"; // return "뷰의이름";
	}
}

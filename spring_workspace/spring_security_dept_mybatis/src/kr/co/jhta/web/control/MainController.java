package kr.co.jhta.web.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
//	localhost:8080/spring_security_dept_mybatis/home  ==> home.jsp
//	localhost:8080/spring_security_dept_mybatis/  ==> home.jsp
	@RequestMapping(value= {"/home", "/"})
	public String home() {
		
		return "home";
	}
	
	@RequestMapping("/common/cLogin")
	public String login() {
		
		return "common/cLogin";
	}
	
	@RequestMapping("/common/cLogout")
	public String logout() {
		return "common/logout";
	}
	
}

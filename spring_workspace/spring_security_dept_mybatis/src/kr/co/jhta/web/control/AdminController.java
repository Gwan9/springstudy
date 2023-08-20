package kr.co.jhta.web.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdminController {
//	localhost:8080/spring_security_dept_mybatis/admin/admin
//	AdminController.admin() ==> admin.jsp 
	@RequestMapping("/admin/admin")
	public String admin() {	
		return "admin";
	}
}

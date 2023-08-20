package kr.co.jhta.web.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DeptController {
	

//	localhost:8080/spring_security_dept_mybatis/dept/list
//	DeptController.list()   ==> list.jsp  (부서 목록 출력) 
	
	@RequestMapping("/dept/list")
	public String list() {
		return"list";
	}
//	localhost:8080/spring_security_dept_mybatis/dept/list  은 user 라는 사용자만 접속가능 비번 : 123​
//	localhost:8080/spring_security_dept_mybatis/admin/admin 은 admin 만 접속 가능 비번 : 456
}

package kr.co.jhta.web.control;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import kr.co.jhta.web.dao.Dao;
import kr.co.jhta.web.dto.DeptDTO;
import lombok.Setter;

@Controller
@Setter
public class DeptController {
	// DAO 인터페이스를 구현한 객체를 할당해줘
	@Autowired
	Dao dao;
	
	@GetMapping("/deptList")
	public String list(Model model) {
		model.addAttribute("list", dao.selectAll());
		return "list";
	}
	
	@GetMapping("/addDept.do")
	public String form() {
		return "addDeptForm";
	}
	@PostMapping("/addDept.do")
	public String addOk(HttpServletRequest req,
//			@RequestParam ("deptno")int deptno,
//			@RequestParam("dname")String dname,
//			@RequestParam("loc")String loc
//			위 맴버변수와 모두 일치할 때 사용가능  ->@ModelAttribute
			@ModelAttribute DeptDTO dto
			) {
		
		System.out.println(dto);
		dao.add(dto);
		
		return "redirect:/deptList";
	}
	
}

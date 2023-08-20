package kr.co.jhta.web.control;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import kr.co.jhta.web.dao.CommonDAO;
import kr.co.jhta.web.dto.MemberDTO;
import lombok.Setter;

@Setter
@Controller
public class JoinController {
	@Autowired
	CommonDAO dao;
	
	// join.do ==> GET => register.jsp 이동
	
	// 회원가입 양식
	
	// join.do => POST => 파라미터 값을 가져와서 db에 입력
	@GetMapping("/join.do")
	public String joinForm() {
		
		return "register";
	}
//	@PostMapping("/join.do")
//	public String joinOk(HttpServletRequest req, 
//			@RequestParam("id")String id,
//			@RequestParam("pw")String pw,
//			@RequestParam("name")String name,
//			@RequestParam("gender")String gender,
//			@RequestParam("motive")String motive
//			) throws UnsupportedEncodingException {
//		
//		req.setCharacterEncoding("UTF-8");
//		
////		String id = req.getParameter("id"); //register.jsp에서 name값을 가져옴
////		String pw = req.getParameter("pw");
////		String name = req.getParameter("name");
////		String gender = req.getParameter("gender");
////		String motive = req.getParameter("motive");
//		
//		MemberDTO dto = new MemberDTO(0, id, pw, name, gender, motive);
//		dao.insertOne(dto);
//			
//		return "redirect:main.do                                                  ";
//	}
	
	
	@PostMapping("/join.do")
	public String joinOk(HttpServletRequest req, 
			@ModelAttribute MemberDTO dto
			) throws UnsupportedEncodingException {
		
		req.setCharacterEncoding("UTF-8");
		
//		MemberDTO dto = new MemberDTO(0, id, pw, name, gender, motive);
		dao.insertOne(dto);
			
		return "redirect:main.do";
	}
	
}

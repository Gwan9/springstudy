package kr.co.jhta.web.control;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import kr.co.jhta.web.dao.MemberDAO;
import kr.co.jhta.web.dto.MemberDTO;

@Controller
public class LoginController {
	
	@Autowired
	MemberDAO dao;
	
	@GetMapping("/login.do")
	public String loginForm() {
		return "login";
	}

	@PostMapping("/login.do")
	public String loginOk(HttpServletRequest req,
			@ModelAttribute MemberDTO mdto,
			HttpSession session, Model model
			) {
		
		//파라미터 값 가져오기
		// 1. HttpServletRequest req
		// 2. @RequestParam
		// 3. @ModelAttribute
		
		MemberDTO dto = dao.selectOne(mdto.getId(), mdto.getPw());
		if (dto != null) {
			session.setAttribute("dto", dto);;
			model.addAttribute("dto", dto);
			return "redirect:/main.do";
			
		}else {
			return "login";
		}
	}
	
	
	@GetMapping("/logout.do")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:main.do";
	}
}

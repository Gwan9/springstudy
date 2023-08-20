package kr.co.jhta.web.control;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.mysql.cj.Session;

import kr.co.jhta.web.dao.CommonDAO;
import kr.co.jhta.web.dto.MemberDTO;
import lombok.Setter;
import oracle.jdbc.proxy.annotation.Post;

@Controller
@Setter
public class LoginController {
	@Autowired
	CommonDAO dao;
	
	@GetMapping("/login.do")
	public String loginForm(){
		return "loginForm";
	}
	
	@PostMapping("/login.do")
	public String loginOk(HttpServletRequest req, Model model, HttpSession session) throws UnsupportedEncodingException {
		
		req.setCharacterEncoding("UTF-8");
		
		String id = req.getParameter("id");
		String pw = req.getParameter("pw");
		
		MemberDTO dto = dao.selectOne(id, pw);
		
		if(dto != null) {
			model.addAttribute("dto", dto);
			// 세션객체에 현재 접속
			session.setAttribute("dto", dto );
			// 로그인에 성공하면 main.do로 리다이렉트
			return "redirect:main.do";
		}
		else {
			
			return "loginForm";
		}
	}
	@GetMapping("/logout.do")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:main.do";
	}
	// POST 방식으로 요청이 들어오면 /login.do 
	// 파라미터 값을 가져오고
	// db에 연결, 존재하는 회원인지 확인
}

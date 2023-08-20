package kr.co.jhta.web.control;

import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
	
	@Autowired
	CommonDAO dao;
	
	
	public void setDao(CommonDAO dao) {
			this.dao = dao;
		}

	//	@RequestMapping(value="/login.do",method=RequestMethod.GET)
	@GetMapping("/login.do")
	public String loginForm() {
		
		return "loginForm";
	}
//	@RequestMapping(value="/login.do",method=RequestMethod.POST)
	
	@PostMapping("/login.do")
	public String loginOk(HttpServletRequest req, Model model) throws UnsupportedEncodingException {
		req.setCharacterEncoding("UTF-8");
		// prarameter 값 가져오기
		String id = req.getParameter("id");
		String pw = req.getParameter("pw");
		// 가져온 값 출력해보기
		
		System.out.println("ID: " + id);
		System.out.println("Password: " + pw);
		// dao 객체를 생성
		MemberDTO dto = dao.selectOne(id, pw);
		// 모델 전달
		
		if(dto != null) {
			//dto가 null이 아니면 loginOk로 보내기 : jsp 파일 생성
			model.addAttribute("dto", dto);
			return "loginOk";
		} else {
			//dto가 null이면 loginForm으로 보내기
			return "loginForm";
		}
		// 뷰로 이동
		//return "loginOk";
	}
	@PostMapping("/register.do")
	public String registerOk(HttpServletRequest req, Model model) throws UnsupportedEncodingException {
		req.setCharacterEncoding("UTF-8");
		
		String id = req.getParameter("id");
		String pw = req.getParameter("pw");
		String name = req.getParameter("name");
		String gender = req.getParameter("gender");
		String motive = req.getParameter("motive");
		
		System.out.println("ID: " + id);
		System.out.println("Password: " + pw);
		System.out.println("name: " + name);
		System.out.println("gender: " + gender);
		System.out.println("motive: " + motive);
		
		MemberDTO dto = new MemberDTO();
		if(dto != null) {
			//dto가 null이 아니면 loginOk로 보내기 : jsp 파일 생성
			model.addAttribute("dto", dto);
			return "registerOk";
		} else {
			return "registerForm";
		}
	}
	
}

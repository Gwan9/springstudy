package kr.co.jhta.web.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import kr.co.jhta.web.dao.MemberDAO;
import kr.co.jhta.web.dto.MemberDTO;

@Controller
public class RegisterController {
	
	@Autowired
	MemberDAO dao;
	
	@GetMapping("/register.do")
	public String form() {
		
		
		
		return "form";
	}
	
	@PostMapping("/register.do")
	public String registerOk(
			@RequestParam("id")String id,
			@RequestParam("pw")String pw,
			@RequestParam("name")String name,
			@RequestParam("gender")String gender,
			@RequestParam("motive")String motive
			) {
			MemberDTO dto = new MemberDTO();
			dto.setId(id);
			dto.setPw(pw);
			dto.setName(name);
			dto.setGender(gender);
			dto.setMotive(motive);
			
			dao.insertOne(dto);
		
		return "redirect:/main.do";
	}
}

package kr.co.jhta.web.control;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import kr.co.jhta.web.dao.CommonDAO;
import kr.co.jhta.web.dto.DeptDTO;
import kr.co.jhta.web.dto.MemberDTO;
import oracle.jdbc.proxy.annotation.Post;


@Controller
public class DeptController {
	
	@Autowired
	CommonDAO dao;
	
	@GetMapping("/list.do")
	public String list(Model model){
		List<DeptDTO> list = dao.selectAll();
		model.addAttribute("list", list);
		return "list";
	}
	@GetMapping("/addData.do")
	public String add() {
		return "addDept";
	}
	
	@PostMapping("/addData.do")
	public String addOk(HttpServletRequest req,
			@RequestParam("dname")String dname,
			@RequestParam("loc")String loc
			) {
		DeptDTO dto = new DeptDTO();
		dto.setDname(dname);
		dto.setLoc(loc);
		dao.insertOne(dto);
		
		return "redirect:/list.do";
	}
	
	@GetMapping("/updateDept")
	public String update(
			@RequestParam("deptno")int deptno,
			Model model
			) {
			model.addAttribute("deptno", deptno);
		return "modify";
	}
	
	@PostMapping("/updateDept")
	public String updateOk(
			@ModelAttribute DeptDTO dto
			){
		
		dao.updateOne(dto);
		
		return "redirect:/list.do";
	}
	
	@GetMapping("/deleteOne.do")
	public String drop(@RequestParam("deptno")int deptno) {
		dao.deleteOne(deptno);
		return "redirect:list.do";
	}
	
}

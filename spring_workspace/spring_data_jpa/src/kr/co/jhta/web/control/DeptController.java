package kr.co.jhta.web.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import kr.co.jhta.web.dto.DeptDTO;
import kr.co.jhta.web.service.DService;
import lombok.extern.slf4j.Slf4j;
import oracle.jdbc.proxy.annotation.Post;
@Slf4j
@Controller
public class DeptController {
	
	@Autowired
	DService dao;
	
	@RequestMapping("/list")
	public String list(Model model) {
		// db에 부서테이블 데이터를 가지고 오기
		model.addAttribute("list", dao.getDeptList());
		return "list";
	}
	
	@GetMapping("/addData")
	public String addForm() {
		log.info("addForm() ======> ");
		return "form";
	}
	@PostMapping("/addData")
	public String add(@ModelAttribute DeptDTO dto) {
		log.info("data 입력 ========> ");
		dao.insertData(dto);
		return "redirect:/list";
	}
	
	@RequestMapping("/detail")
	public String detail(
			@RequestParam("deptno")int no,
			Model model
			) {
		
		model.addAttribute("dto", dao.getDeptData(no));
		
		return "detail";
	}
	
	@GetMapping("/modify")
	public String modifyForm(
			@RequestParam("deptno")int no, Model model) {
		
		model.addAttribute("dto", dao.getDeptData(no));
		return "modifyForm";
	
	}
	@PostMapping("/modify")
	public String modify(@ModelAttribute DeptDTO dto) {
		dao.updateData(dto);
		return "redirect:/list";
	}
	
	@GetMapping("/delete")
	public String deleteOk(@RequestParam("deptno")int no) {
		dao.deleteData(no);
		return "redirect:/list";
	}
	
	
	
}

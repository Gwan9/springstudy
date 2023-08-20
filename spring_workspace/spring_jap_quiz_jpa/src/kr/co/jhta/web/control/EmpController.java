package kr.co.jhta.web.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import kr.co.jhta.web.dto.EmpDTO;
import kr.co.jhta.web.service.EService;

@Controller
public class EmpController {
	@Autowired
	EService dao;
	
	
	@GetMapping("/list")
	public String list(Model model) {
		
		model.addAttribute("list", dao.getEmpList());
		
		return "list";
	}
	
	@GetMapping("/addOne")
	public String addForm() {
		
		return "addForm";
	}
	
	@PostMapping("/addOne")
	public String addOne(@ModelAttribute EmpDTO dto) {
		dao.insertData(dto);
		return "redirect:/list";
	}
	
	@GetMapping("/detail")
	public String detail(@RequestParam("empno")int no, Model model) {
		model.addAttribute("dto", dao.getEmpData(no));
		return "detail";
	}
	@GetMapping("/modify")
	public String modifyForm(@RequestParam("empno")int no, Model model) {
		model.addAttribute("dto", dao.getEmpData(no));
		return "modifyForm";
	}
	
	@PostMapping("/modify")
	public String modify(@ModelAttribute EmpDTO dto) {
		
		dao.updateData(dto);
		return "redirect:/list";
	}
	
	@GetMapping("/delete")
	public String deleteOk(@RequestParam("empno")int no) {
		dao.deleteOne(no);
		return "redirect:/list";
	}
	
	
}

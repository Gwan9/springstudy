package kr.co.jhta.web.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kr.co.jhta.web.dao.Dao;
import kr.co.jhta.web.dto.EmpDTO;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class EmpController {
	
	@Autowired
	Dao dao;
	
	// GET    : localhost:8080/spring_rest2/emp
	//			==> 사원정보전체를 JSON, XML로 출력
	
//	@GetMapping(value="/emp", produces=MediaType.APPLICATION_JSON_VALUE)
	@GetMapping(value="/emp", produces=MediaType.APPLICATION_XML_VALUE)
	public List<EmpDTO> selectAll() {
		
		return dao.selectAll();
	}
	// GET    :  localhost:8080/spring_rest2/emp/7788  
	//			==> 7788 사원정보 JSON, XML로 출력
//	@GetMapping(value="/emp/{empno}", produces=MediaType.APPLICATION_JSON_VALUE)
	@GetMapping(value="/emp/{empno}", produces=MediaType.APPLICATION_XML_VALUE)
	public EmpDTO selectOne(
			@PathVariable("empno")int empno
			) {
		return dao.selectOne(empno);
	}
	
	// POST   : localhost:8080/spring_rest2/emp/1111?ename=KS&JOB=MANAGER&deptno=10 
	//			==>1111번 사원정보 JSON
	@PostMapping(value="/emp/{empno}", produces=MediaType.APPLICATION_JSON_VALUE)
	public EmpDTO insertOne(
			@PathVariable("empno")int empno,
			@RequestParam("ename")String ename,
			@RequestParam("JOB")String JOB,
			@RequestParam("deptno")int deptno
			) {
		EmpDTO dto = new EmpDTO();
		dto.setEmpno(empno);
		dto.setEname(ename);
		dto.setJOB(JOB);
		dto.setDeptno(deptno);
		dao.insertOne(dto);
		return dto;
	}
	
	// PUT(전체): localhost:8080/spring_rest2/7788?JOB=CLERK  
	//			==> 10번 부서정보를 수정
	@PatchMapping(value="/emp/{empno}", produces=MediaType.APPLICATION_JSON_VALUE)
	public EmpDTO updateOne(
			@PathVariable("empno")int empno,
			@RequestParam("JOB")String JOB
			) {
		EmpDTO dto = new EmpDTO();
		dto.setEmpno(empno);
		dto.setJOB(JOB);
		dao.updateOne(dto);
		return dto;
	}
	// DELETE  : localhost:8080/spring_rest2/dept/1111  
	//			==> 1111사원  정보를 삭제 
	@DeleteMapping(value="/emp/{empno}", produces=MediaType.APPLICATION_JSON_VALUE)
	public void deleteOne(
			@PathVariable("empno")int empno
			) {
		dao.deleteOne(empno);
	}
		
	
	
	
}

package kr.co.jhta.web.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kr.co.jhta.web.dao.Dao;
import kr.co.jhta.web.dto.DeptDTO;
import lombok.extern.slf4j.Slf4j;

@Slf4j
//@Controller+@ResponseBody = 
@RestController
public class DeptController {
	
	@Autowired
	Dao dao;
	
	@GetMapping(value="/test1", produces="text/plain;charset=UTF-8")
	public String test() {
		log.info("Mine type : {} " , MediaType.TEXT_PLAIN_VALUE);
		return "Hello Rest World!";
	}
	
	@GetMapping(value="/test2", produces="text/plain;charset=UTF-8")
	public ResponseEntity<String> test2(){
		log.info("Mine Type 2 {} ", MediaType.TEXT_PLAIN_VALUE);
		// 1부터 10사이의 정수를 랜덤하게 값을 뽑음
		int result = (int)(Math.random() * 10)+1;
		log.info("result : {} ", result);
		// 로그로 출력
		
		// 조건에 따라 다른 결과를 갖게 하려함
		if(result < 5) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Hello Rest API World!!");
		}else {
			return ResponseEntity.status(HttpStatus.OK).body("Hello Rest API World!!");
		}
	}
	@GetMapping(value="/dept", produces=MediaType.APPLICATION_XML_VALUE)
	public List<DeptDTO> getAll() {
		
		
		return dao.selectAll();
	}
	//-> JSON 으로 변형
	
	// @PathVariable("no") 주소에 있는 변수 "no"
	@GetMapping(value="/dept/{no}", produces=MediaType.APPLICATION_JSON_VALUE)
	public DeptDTO getOne(@PathVariable("no")int deptno) {
		return dao.selectOne(deptno);
	}
	
	
	@PostMapping(value="/dept/{deptno}", produces=MediaType.APPLICATION_JSON_VALUE)
	public DeptDTO write(
			@PathVariable("deptno")int deptno,
			@RequestParam("dname")String dname,
			@RequestParam("loc")String loc
			) {
		DeptDTO dto = new DeptDTO(deptno, dname, loc);
		dao.insertOne(dto);
		return dto;
	}
	
	@DeleteMapping(value="/dept/{deptno}",produces=MediaType.APPLICATION_JSON_VALUE )
	public DeptDTO deleteOne(@PathVariable("deptno")int deptno) {
		DeptDTO dto = dao.selectOne(deptno);
		dao.deleteOne(deptno);
		return dto;
	}
	
	@PatchMapping(value="/dept/{deptno}", produces=MediaType.APPLICATION_JSON_VALUE)
	public DeptDTO updateOne(
			@PathVariable("deptno")int deptno,
			@RequestParam("loc")String loc
			) {
		DeptDTO dto = new DeptDTO();
		dto.setDeptno(deptno);
		dto.setLoc(loc);
		dao.updateOne(dto);
		return dto;
	}
	
	
}

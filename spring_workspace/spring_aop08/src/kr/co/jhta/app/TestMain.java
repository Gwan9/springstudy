package kr.co.jhta.app;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.jhta.app.dao.CommonDAO;
import kr.co.jhta.app.dto.DeptDTO;
import kr.co.jhta.app.service.DBService;

public class TestMain {
	public static void main(String[] args) {
		
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("application.xml");
		// 메서드를 호출할 때 얼마나 시간이 걸리는 지 측정
		DBService service = ac.getBean("service", DBService.class);
		
		
		List<DeptDTO> list = service.readAll();
		
		for(DeptDTO dto : list) {
			System.out.println(dto.getDeptno() + " : " + dto.getDname() + " : " + dto.getLoc()                                                               );
		}
		
	}
	
}

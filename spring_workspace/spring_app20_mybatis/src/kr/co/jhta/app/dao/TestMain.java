package kr.co.jhta.app.dao;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.jhta.app.dto.DeptDTO;

public class TestMain {
	public static void main(String[] args) {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("app.xml");
		
		Dao d = ac.getBean("dao", Dao.class);
		
		List<DeptDTO> list = d.selectAll();
		
		for(DeptDTO dto : list) {
			System.out.println(dto.getDeptno() + " : " + dto.getDname() + " : " + dto.getLoc());
		}
		
		System.out.println("-------------------------");
		
		// 99 기획 서울 데이터 추가
		DeptDTO dto2 = new DeptDTO(99, "기획", "서울");
		
		d.insertOne(dto2);
		
		dto2.setLoc("부산");
		
		d.updateOne(dto2);
		
		DeptDTO dto3 = d.selectOne(dto2.getDeptno()); // 99번 부서
		
		System.out.println(dto3.getDeptno() + " : " + dto3.getDname() + " : " + dto3.getLoc());
		
	}
}

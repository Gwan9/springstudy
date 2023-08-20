package kr.co.jhta.app;

import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.jhta.app.dao.CommonDAO;
import kr.co.jhta.app.dto.DeptDTO;
import kr.co.jhta.app.service.DBService;

public class TestMain {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("app.xml");
		
		//CommonDAO dao = ac.getBean("dao", CommonDAO.class);
		DBService service = ac.getBean("service", DBService.class);
		
		ArrayList<DeptDTO> list = service.readAll();
		
//		dao.connect();
//		ArrayList<DeptDTO> list = dao.selectAll();
		for(DeptDTO dto : list) {
			System.out.println(dto.getDeptno() + " : " + dto.getDname() + " : " + dto.getLoc());
		}
		//dao.close();
	}

}

package kr.co.jhta.app.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import kr.co.jhta.app.dao.CommonDAO;
import kr.co.jhta.app.dto.DeptDTO;

public class DeptService implements DBService{
	// 이곳에 할당할 수 있는 적절한 객체를 연결해줘
	@Autowired
	@Qualifier("mysqldao")
	CommonDAO dao;
	
	DeptService(){
		
	}
	
	public DeptService(CommonDAO dao) {
		super();
		this.dao = dao;
		
	}

	@Override
	public ArrayList<DeptDTO> readAll() {
		dao.connect();
		ArrayList<DeptDTO> list = dao.selectAll();
		dao.close();
		return list;
	}

	@Override
	public DeptDTO readOne(int no) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void write(DeptDTO dto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modify(DeptDTO dto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void drop(int no) {
		// TODO Auto-generated method stub
		
	}

}

package kr.co.jhta.web.service;

import java.util.List;

import org.springframework.stereotype.Service;

import kr.co.jhta.web.dao.Dao;
import kr.co.jhta.web.dto.DeptDTO;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service("deptServiceBean")
public class DeptService implements DBService{
	Dao dao;
	
	@Override
	public List<DeptDTO> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(DeptDTO dto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modify(DeptDTO dto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(int bno) {
		// TODO Auto-generated method stub
		
	}


}

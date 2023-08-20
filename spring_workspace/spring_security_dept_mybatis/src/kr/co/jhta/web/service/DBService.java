package kr.co.jhta.web.service;

import java.util.List;

import kr.co.jhta.web.dto.DeptDTO;

public interface DBService {
	public List<DeptDTO> selectAll();
	public void add(DeptDTO dto);
	public void modify(DeptDTO dto);
	public void remove(int bno);
}	

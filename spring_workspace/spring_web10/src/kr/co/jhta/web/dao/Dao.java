package kr.co.jhta.web.dao;

import java.util.List;

import kr.co.jhta.web.dto.DeptDTO;

public interface Dao {
	public List<DeptDTO> selectAll();
	public void add(DeptDTO dto);
}

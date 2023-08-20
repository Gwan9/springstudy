package kr.co.jhta.web.dao;

import java.util.List;

import kr.co.jhta.web.dto.EmpDTO;

public interface Dao {
	public List<EmpDTO> selectAll();
	public EmpDTO selectOne(int no);
	public void insertOne(EmpDTO dto);
	public void updateOne(EmpDTO dto);
	public void deleteOne(int no);
}

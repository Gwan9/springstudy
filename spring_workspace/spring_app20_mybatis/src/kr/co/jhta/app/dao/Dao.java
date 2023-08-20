package kr.co.jhta.app.dao;

import java.util.List;

import kr.co.jhta.app.dto.DeptDTO;

public interface Dao {
	public List<DeptDTO> selectAll();
	public DeptDTO selectOne(int no);
	public void insertOne(DeptDTO dto);
	public void updateOne(DeptDTO dto);
	public void deleteOne(int no);
}
package kr.co.jhta.web.dao;

import java.util.List;

import kr.co.jhta.web.dto.DeptDTO;

public interface CommonDAO {
	public void connect();

	List<DeptDTO> selectAll();

	public void insertOne(DeptDTO dto);

	public void updateOne(DeptDTO dto);

	public void deleteOne(int deptno);
}

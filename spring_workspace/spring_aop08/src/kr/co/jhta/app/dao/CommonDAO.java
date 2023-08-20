package kr.co.jhta.app.dao;

import java.util.ArrayList;

import kr.co.jhta.app.dto.DeptDTO;

public interface CommonDAO {
	public void connect();
	public ArrayList<DeptDTO> selectAll();
	public DeptDTO selectOne(int no);
	public void insertOne(DeptDTO dto);
	public void updateOne(DeptDTO dto);
	public void deleteOne(int no);
	public void close();
	
}

package kr.co.jhta.app.service;

import java.util.ArrayList;

import kr.co.jhta.app.dto.DeptDTO;

public interface DBService {
	public ArrayList<DeptDTO> readAll();
	public DeptDTO readOne(int no);
	public void write(DeptDTO dto);
	public void modify(DeptDTO dto);
	public void drop(int no);
}

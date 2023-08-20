package kr.co.jhta.web.repository;

import java.util.List;

import kr.co.jhta.web.dto.EmpDTO;

public interface Dao {
	public List<EmpDTO> getEmpList();

	public void insertData(EmpDTO dto);

	public EmpDTO getEmpData(int no);
	
	public void updateData(EmpDTO dto);

	public void deleteOne(int no);
}

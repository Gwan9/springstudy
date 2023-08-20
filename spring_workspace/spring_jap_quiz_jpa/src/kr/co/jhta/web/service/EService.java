package kr.co.jhta.web.service;

import java.util.List;

import kr.co.jhta.web.dto.EmpDTO;

public interface EService {
	
	
	public List<EmpDTO> getEmpList();

	public void insertData(EmpDTO dto);

	public EmpDTO getEmpData(int no);

	public void updateData(EmpDTO dto);

	public void deleteOne(int no);

}

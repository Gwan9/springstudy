package kr.co.jhta.web.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Service;

import kr.co.jhta.web.dto.EmpDTO;
import kr.co.jhta.web.repository.EmpRepository;

@Service
@Transactional
@EnableJpaRepositories("kr.co.jhta.web.repository")
public class EmpService implements EService{
	
	EmpRepository repository;

	@Override
	public List<EmpDTO> getEmpList() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public void insertData(EmpDTO dto) {
		// TODO Auto-generated method stub
		repository.save(dto);
		
	}

	@Override
	public EmpDTO getEmpData(int no) {
		// TODO Auto-generated method stub
		return repository.findByEmpno(no);
	}

	@Override
	public void updateData(EmpDTO dto) {
		repository.save(dto);
		
	}

	@Override
	public void deleteOne(int no) {
		repository.deleteById(no);
	}
}

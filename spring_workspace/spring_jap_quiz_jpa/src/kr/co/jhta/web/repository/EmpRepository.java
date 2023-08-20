package kr.co.jhta.web.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kr.co.jhta.web.dto.EmpDTO;

@Repository
public interface EmpRepository extends JpaRepository<EmpDTO, Integer> {

	List<EmpDTO> findByEname(String ename);
	
	EmpDTO findByEmpno(int empno);
}

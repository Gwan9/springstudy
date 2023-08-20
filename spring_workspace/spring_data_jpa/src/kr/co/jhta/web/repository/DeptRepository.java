package kr.co.jhta.web.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kr.co.jhta.web.dto.DeptDTO;

@Repository
public interface DeptRepository extends JpaRepository<DeptDTO, Integer> {
	List<DeptDTO> findByDname(String dname);
	DeptDTO findByDeptno(int deptno);
	
	
	// save(S) : 새로운 엔티티를 저장하고, 이미 있는 엔티티는 수정
	// delete(T) : 엔티티는 하나 삭제, 내부적으로 entityManger.remove()호출
	// findOne(ID) : 엔티티는 하나 조회
	// findAll : 모든 엔티티 조회
	
}

package kr.co.jhta.web.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import kr.co.jhta.web.dto.DeptDTO;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Repository
@Transactional
public class DeptDAO implements Dao {

	@PersistenceContext
	private EntityManager em;
	
	
	@Override
	public List<DeptDTO> getDeptList() {
		log.info("em:{}",em);
		
		return em.createQuery("select b from DeptDTO b order by b.deptno desc").getResultList();
	}


	@Override
	public void insertData(DeptDTO dto) {
		log.info("insertData() ==============>");
		em.persist(dto);
		// insert문 쓸 필요 X
	}


	@Override
	public DeptDTO getDeptData(int no) {
		
		return em.find(DeptDTO.class, no);
	}


	@Override
	public void updateData(DeptDTO dto) {
		em.merge(dto);
		
	}


	@Override
	public void deleteData(int no) {
		em.remove(em.find(DeptDTO.class, no));
		
	}
	
	

}

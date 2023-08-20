package kr.co.jhta.web.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import kr.co.jhta.web.dto.EmpDTO;

@Repository
@Transactional
public class EmpDAO implements Dao {
	@PersistenceContext
	private EntityManager em;
	
	@Override
	public List<EmpDTO> getEmpList() {
		return em.createQuery("select b from EmpDTO b order by b.empno desc").getResultList();
	}

	@Override
	public void insertData(EmpDTO dto) {
		em.persist(dto);
		
	}
	
	@Override
	public EmpDTO getEmpData(int no) {
		return em.find(EmpDTO.class, no);
	}
	
	@Override
	public void updateData(EmpDTO dto) {
		em.merge(dto);
	}
	@Override
	public void deleteOne(int no) {
		em.remove(em.find(EmpDTO.class, no));
	}

}

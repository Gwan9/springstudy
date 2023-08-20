package kr.co.jhta.web.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.jhta.web.dto.EmpDTO;

@Repository
public class EmpDAO implements Dao{
	
	@Autowired
	private SqlSession ss;

	@Override
	public List<EmpDTO> selectAll() {
		return ss.selectList("kr.co.jhta.selectAll");
	}

	@Override
	public EmpDTO selectOne(int no) {
		return ss.selectOne("kr.co.jhta.selectOne", no);
	}

	@Override
	public void insertOne(EmpDTO dto) {
		ss.insert("kr.co.jhta.insertOne", dto);
		
	}

	@Override
	public void updateOne(EmpDTO dto) {
		ss.update("kr.co.jhta.updateOne", dto);
		
	}

	@Override
	public void deleteOne(int no) {
		ss.delete("kr.co.jhta.deleteOne", no);
		
	}
}

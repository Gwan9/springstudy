package kr.co.jhta.web.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.jhta.web.dto.DeptDTO;

@Repository
public class DeptDAO implements Dao {
	
	@Autowired
	private SqlSession ss;
	
	@Override
	public List<DeptDTO> selectAll() {
		return ss.selectList("kr.co.jhta.selectAll");
	}

	@Override
	public DeptDTO selectOne(int no) {
		return ss.selectOne("kr.co.jhta.selectOne", no);
	}

	@Override
	public void insertOne(DeptDTO dto) {
		ss.insert("kr.co.jhta.addOne", dto);
	}

	@Override
	public void updateOne(DeptDTO dto) {
		ss.update("kr.co.jhta.modifyOne", dto);
	}

	@Override
	public void deleteOne(int no) {
		ss.delete("kr.co.jhta.deleteOne", no);
	}

}

package kr.co.jhta.app.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import kr.co.jhta.app.dto.DeptDTO;

public class DeptDAO implements Dao {
	
	ConnectionManager cm;
	
	public void setCm(ConnectionManager cm) {
		this.cm = cm;
	}

	@Override
	public List<DeptDTO> selectAll() {
		SqlSession ss = ConnectionManager.factory.openSession(true);
		List<DeptDTO> list = ss.selectList("kr.co.jhta.app.dept.selectAll");
		ss.close();
		return list;
	}

	@Override
	public DeptDTO selectOne(int no) {
		SqlSession ss = ConnectionManager.factory.openSession(true);
		Object obj = ss.selectOne("kr.co.jhta.app.dept.selectOne", no);
		DeptDTO dto = (DeptDTO)obj;
		ss.close();
		return dto;
	}

	@Override
	public void insertOne(DeptDTO dto) {
		
		ConnectionManager.factory.openSession(true)
		.insert("kr.co.jhta.app.dept.insertOne", dto);
	}
	
	@Override
	public void updateOne(DeptDTO dto) {
		ConnectionManager.factory.openSession(true)
		.update("kr.co.jhta.app.dept.updateOne", dto);
	}

	@Override
	public void deleteOne(int no) {
		// TODO Auto-generated method stub
		
	}

}

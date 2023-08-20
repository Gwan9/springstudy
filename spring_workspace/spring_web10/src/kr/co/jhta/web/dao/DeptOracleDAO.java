package kr.co.jhta.web.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import kr.co.jhta.web.dto.DeptDTO;

// 컴포턴트로 만들어줘 (빈으로 등록해)=> 
// db에 저장할 때 사용하는 저장소

@Repository
public class DeptOracleDAO implements Dao{
	@Autowired
	SqlSession ss;
	@Override
	public List<DeptDTO> selectAll() {
		
		
		return ss.selectList("kr.co.jhta.dept.selectAll");
	}

	@Override
	public void add(DeptDTO dto) {
//		ss.insert("네임스페이스명.id", dto);
		ss.insert("kr.co.jhta.dept.addOne", dto);
		
	}

}

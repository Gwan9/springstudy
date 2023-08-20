package kr.co.jhta.web.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.jhta.web.dto.DeptDTO;
import kr.co.jhta.web.dto.MemberDTO;

@Repository
public class DeptOracleDAO implements CommonDAO {
	
	@Autowired
	SqlSession ss;
	
	@Override
	public void connect() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<DeptDTO> selectAll() {
		
		return ss.selectList("kr.co.jhta.dept.selectAll");
	}

	@Override
	public void insertOne(DeptDTO dto) {
		ss.insert("kr.co.jhta.dept.insertOne", dto);
		
	}

	@Override
	public void updateOne(DeptDTO dto) {
		ss.update("kr.co.jhta.dept.updateOne", dto);
		
	}

	@Override
	public void deleteOne(int deptno) {
		ss.delete("kr.co.jhta.dept.deleteOne", deptno);
		
	}
	


	
}

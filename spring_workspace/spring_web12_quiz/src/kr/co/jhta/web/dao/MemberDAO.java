package kr.co.jhta.web.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.jhta.web.dto.MemberDTO;
@Repository
public class MemberDAO {
	@Autowired
	SqlSession ss;
	
	public MemberDTO selectOne(String id, String pw) {
		
		MemberDTO dto = new MemberDTO();
		dto.setId(id);
		dto.setPw(pw);
		
		MemberDTO dto2 = ss.selectOne("kr.co.jhta.dept.login", dto);
		
		return dto2;
	}
	
	public void insertOne(MemberDTO dto) {
		
		ss.update("kr.co.jhta.dept.registerOne", dto);
	}

}
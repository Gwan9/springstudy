package kr.co.jhta.web.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import kr.co.jhta.web.dto.DeptDTO;
import kr.co.jhta.web.dto.MemberDTO;

@Repository
public class DeptOracleDAO implements CommonDAO {
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	String user = "scott";
	String password = "tiger";
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	StringBuffer sb = new StringBuffer();
	
	public DeptOracleDAO() {
		// conn <== 참조값 생기도록
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("conn : " + conn);
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("DB 연결 실패");
			e.printStackTrace();
		}	
	}
	
	@Override
	public List<DeptDTO> selectAll() {
		List<DeptDTO> list = new ArrayList<DeptDTO>();
		sb.setLength(0);
		sb.append("SELECT * from dept ");
		
		try {
			pstmt = conn.prepareStatement(sb.toString());
		    rs = pstmt.executeQuery();
			while(rs.next()) {
				int deptno = rs.getInt("deptno");
				String dname = rs.getString("dname");
				String loc = rs.getString("loc");
				
				DeptDTO dto = new DeptDTO(deptno, dname, loc);
				list.add(dto);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public void connect() {
		// TODO Auto-generated method stub
		
	}
	
	public void insertOne(DeptDTO dto) {
		sb.setLength(0);
		sb.append("INSERT INTO dept ");
		sb.append("VALUES ( dept_deptno_seq.nextval, ?, ? ) ");
		
		try {
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setString(1, dto.getDname());
			pstmt.setString(2, dto.getLoc());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
	}

	@Override
	public void updateOne(DeptDTO dto) {
	    try {
	        sb.setLength(0);
	        sb.append("UPDATE dept ");
	        sb.append("SET dname = ?, loc = ? ");
	        sb.append("WHERE deptno = ?");
	        
	        pstmt = conn.prepareStatement(sb.toString());
	        pstmt.setString(1, dto.getDname());
	        pstmt.setString(2, dto.getLoc());
	        pstmt.setInt(3, dto.getDeptno());
	        pstmt.executeUpdate();
	        
	    } catch (SQLException e) {
	        e.printStackTrace();
	        
	    }
	}
	
	public void deleteOne(int deptno) {
		
		sb.setLength(0);
		sb.append("DELETE from dept where deptno = ? ");
		
		try {
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setInt(1, deptno);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}


	
}

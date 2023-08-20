package kr.co.jhta.web.control;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MemberDAO implements CommonDAO{
	// 1. 환경변수
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	String user = "scott";
	String password = "tiger";
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	StringBuffer sb = new StringBuffer();
	
	public MemberDAO() {
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
	public MemberDTO selectOne(String id, String pw) {
		sb.setLength(0);
		sb.append("SELECT no, id, pw, name, gender, motive ");
		sb.append("FROM member ");
		sb.append("WHERE id = ? and pw = ?");
		
		MemberDTO dto = null;
		try {
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setString(1, id);
		    pstmt.setString(2, pw);
		    rs = pstmt.executeQuery();
			while(rs.next()) {
				int no = rs.getInt("no");
				String name = rs.getString("name");
				String gender = rs.getString("gender");
				String motive = rs.getString("motive");
				
				dto = new MemberDTO(no, id, pw, name, gender ,motive);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dto;
	}

	@Override
	public void connect() {
		// TODO Auto-generated method stub
		
	}

	

}

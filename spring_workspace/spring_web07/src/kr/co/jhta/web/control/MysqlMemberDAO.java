package kr.co.jhta.web.control;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MysqlMemberDAO implements CommonDAO {

	String driver = "com.mysql.cj.jdbc.Driver";
	String url = "jdbc:mysql://orcl.csf4hsopkyid.ap-northeast-2.rds.amazonaws.com:3306/orcl";
	String user = "scott";
	String password = "tigertiger12";
	Connection conn = null;
	PreparedStatement pstmt= null;
	ResultSet rs= null;
	StringBuffer sb = new StringBuffer();
		
	
	public MysqlMemberDAO() {
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
	public void connect() {
		// TODO Auto-generated method stub
		
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
	
	public void insertOne(String id, String pw, String name, String gender, String motive) {
		sb.setLength(0);
		sb.append("INSERT INTO member ( id, pw, name, gender, motive ");
		sb.append("VALUES ( ?, ?, ?, ?, ?) ");
		sb.append("COMMIT ");
		
		
		MemberDTO dto = null;
		try {
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setString(1, id);
		    pstmt.setString(2, pw);
		    pstmt.setString(3, name);
		    pstmt.setString(4, gender);
		    pstmt.setString(5, motive);
		    rs = pstmt.executeQuery();
			while(rs.next()) {
				int no = rs.getInt("no");
				
				dto = new MemberDTO(no, id, pw, name, gender ,motive);
				dto.setId(id);
				dto.setPw(pw);
				dto.setName(name);
				dto.setGender(gender);
				dto.setMotive(motive);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}

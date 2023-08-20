package kr.co.jhta.web.control;

public interface CommonDAO {
	public void connect();
	public MemberDTO selectOne(String id, String pw);
	
}

package kr.co.jhta.web.dao;

import kr.co.jhta.web.dto.MemberDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public interface CommonDAO {
	public void connect();
	public MemberDTO selectOne(String id, String pw);
	public void insertOne(MemberDTO dto);

	
}

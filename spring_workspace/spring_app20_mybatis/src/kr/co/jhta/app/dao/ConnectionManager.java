package kr.co.jhta.app.dao;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class ConnectionManager {
	// JDBC : Connection
	// MyBatis : SqlSession
	
	static SqlSessionFactory factory;
	
	static { // static block , 생성자보다 먼저 실행됨
		try {
			// 설계도
			Reader r = Resources.getResourceAsReader("resource/sqlMapConfig.xml");
			
			// 공장인부
			SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
			
			// 공장건설
			factory = builder.build(r);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}

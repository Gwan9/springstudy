package kr.co.jhta.app;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.core.SimpleAliasRegistry;

import jdk.jfr.events.FileWriteEvent;

public class LoggingAdvice implements AfterReturningAdvice {

	@Override
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		makeLog();
	}
	
	
	public void makeLog(){
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyyMMdd일");
		String filename = sdf2.format(d);
		String msg = sdf.format(d);
		
		File f = new File("d:\\log\\log"+filename+".log");
		
		
		//byteStream 1바이트씩, Cahracter 2바이트씩
		
		File directoryFile = new File("d:\\log");
		if (!directoryFile.exists()) {
			directoryFile.mkdirs();
		}
		
		if(!f.exists()) {
			try {
				f.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}// if end
		
		FileWriter fw = null;
		PrintWriter pw = null;
		try {
			fw = new FileWriter(f, true);
			pw = new PrintWriter(fw); // printwriter => 다양한 자료형을 쉽게 쓸 수 있음;
			pw.println(msg + "에 이체함 \n"); // 내부적으로 버퍼를 사용
			System.out.println(msg + "에 이체함 \n");
			pw.flush(); // flush 로 내보내야함
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 자원반납
		finally {
			try {
				if(fw != null)fw.close();
				if(pw != null)pw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}// try catch finally end
		
		
		
	}

}

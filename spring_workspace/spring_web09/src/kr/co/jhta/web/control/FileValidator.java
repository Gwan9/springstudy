package kr.co.jhta.web.control;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import org.springframework.web.multipart.MultipartFile;

// 파일의 유효성 검사 클래스
public class FileValidator implements Validator {
	
	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void validate(Object target, Errors errors) {
		// 검사 대상 : target
		// 이 때 발생하는 에러 : errors
		
		UploadFile file = (UploadFile)target;
		
		MultipartFile mf = file.getFile();
		
		int fileSize = 1024*1024*100; // 100MB
		
		if(mf.getSize() == 0) {
			errors.rejectValue("file", null, "파일을 선택해주세요");
			
		}	else if(mf.getSize() > fileSize) {
			errors.rejectValue("file", null, "10M 이하의 파일만 전송가능합니다.");
			
		}
		
	}

}

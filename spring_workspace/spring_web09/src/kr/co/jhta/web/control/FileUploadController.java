package kr.co.jhta.web.control;

import java.io.File;
import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FileUploadController {
	
	@Autowired
	FileValidator filevalidator;
	
	@GetMapping("/upload/upload.do")
	public String uploadForm() {
		
		return"upload/form";
	}
	
	@PostMapping("/upload/upload.do")
	public ModelAndView upload(HttpServletRequest req,
			@ModelAttribute UploadFile file,
			BindingResult result
			) {
		// 파일 유효성 검사 후 성공하면 작업을 계속
		// 실패하면 중단
		filevalidator.validate(file,result);
		if(result.hasErrors()) {
			
			
			
			// 결과에 에러가 존재한다면 다시 돌아가
			return new ModelAndView("upload/form");
					
		}
		
		
		// 파일은 어디에 저장 /data
		// 서버에 저장 할 실제 디렉토리
		HttpSession session = req.getSession();
		ServletContext application =session.getServletContext();
		
		String filePath = application.getRealPath("/data");
		System.out.println("파일의 저장 될 실제 경로" +  filePath);
		
		// 매개변수로 전달 받은 파일 객체
		System.out.println("file : " + file);
		System.out.println("file.getFile() : " + file.getFile());
		
		MultipartFile mfile = file.getFile();
		
		// 파일이름구하기
		String fileName = mfile.getOriginalFilename();
		// 파일객체로만듬 : 저장될경로 + "/" + 파일명
		File f = new File(filePath + "/" + fileName);
		
		// 임시경로에 보관중인 파일을 실제 위치에 저장
		try {
			mfile.transferTo(f);
		} catch (IllegalStateException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// ModelAndView 객체 생성
		ModelAndView mav = new ModelAndView();
		
		// 파일 이름 경로 전달하기
		mav.addObject("fileName", f.getName());
		// 파일의 상대경로 위치 전달
		mav.addObject("filePath", "../data/" + f.getName());
		// 찾아 갈 뷰의 위치 지정
		mav.setViewName("upload/uploadFile");
		
		
		return mav;
		
	}
	
	
	// @ResponseBody 
	// 웹 애플리케이션의 모델층에서 리턴한 결과물(ModelAndView)을 보통 (JSP)로 포워딩하여 출력
	// 이 때 뷰페이지를 통하지 않고 바로 출력스트림으로 보내는 것
	// 파일 다운로드, Ajax에 사용
	
	
	
	@RequestMapping("/upload/download.do")
	@ResponseBody
	public byte[] download(HttpServletRequest req,
			@RequestParam("fileName")String fileName,
			HttpServletResponse resp
			) {
		// download.do?fileName=aa.PNG
		// /data 디렉토리에 저장되어 있다.
		
		// 요청객체로부터 ==> 세션객체 ==> application 객체
		
//		HttpSession session = req.getSession();
//		ServletContext application = session.getServletContext();
//		
//		String filePath = application.getRealPath("/data");
		
		String filePath = req.getSession()
					      	.getServletContext()
						 	.getRealPath("/data");
		
		// 파일의 절대경로 구할 수 있다.
		System.out.println("/data 디렉토리의 절대 경로 : " + filePath);
		
		String absFilePath = filePath + "/" + fileName;
		
		System.out.println("다운로드 받을 파일의 절대 경로 " + absFilePath);
		
		// 파일 객체 생성
		File f = new File(absFilePath);
		
		// 전송 할 파일을 byte[] 형태로 형 변환 시켜준다.
		byte[] b = null;
		try {
			b = FileCopyUtils.copyToByteArray(f);
			
			// 브라우저가 지금 보내는 내용을 이해할 수 있도록 헤더를 추가
			String fn = new String(f.getName().getBytes(),"iso_8859_1");
			
			// 파일이름
			resp.setHeader("Content-Disposition", "attachment;filename=\""+fn+"\"");
			// 파일의 길이
			resp.setContentLength(b.length);
			// 파일의 종류
			resp.setContentType("image/jpeg");
			
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return b;
	}
}

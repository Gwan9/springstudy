package spring_web1;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

// Controller : 비지니스 로직이 담겨있는 클래스
// Controller 인터페이스를 구현한 클래스
public class HelloController implements Controller {
//Controller interface 를 상속
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// 요청 데이터 : req.getAttribute();
		
		// 전달 할 데이터 : Model
		// 찾아 갈 뷰 객체 : View
		ModelAndView mav = new ModelAndView();
		//req.SetAttribute("data", "안녕하세요");
		mav.addObject("data", "안녕하세요");
		mav.setViewName("hello");
		
		return mav;
	}

}

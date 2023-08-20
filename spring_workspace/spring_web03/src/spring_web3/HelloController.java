package spring_web3;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class HelloController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg","안녕");
		mav.setViewName("new");
		ModelAndView mav1 = new ModelAndView("new", "msg", "안녕하세요");
		mav1.addObject("test1", "두개 이상도 전달할 수 있음");
		return mav1;
	}

}

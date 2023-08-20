package kr.co.jhta.web.control;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

// 상속 X => 형식이 자유로워짐
@Controller
public class IndexController {
		// 여러 개의 요청을 처리할 수 잇다.
		// ("/goHome.do") 이렇게 요청이 오면 이 메서드를 해
		@RequestMapping("/goHome.do")
		public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse resp) {
			return new ModelAndView("home","msg","오늘의 명언");
		}
		
		@RequestMapping(value= {"/test.do", "/test2.do"})
		public ModelAndView aaa() {
			return new ModelAndView("test",  "msg" , "test.do를 통해서 실행");
		}
		@RequestMapping("/doTest.do")
		public ModelAndView bbb() {
			return new ModelAndView("test3");
		}
		@RequestMapping("/doTest2.do")
		public String ccc() {
			return "test3"; // 뷰 이름
		}
		@RequestMapping(value= "/doTest3.do", method=RequestMethod.GET) // GET 방식만 지원
		public String ddd() {
			return "test4";
		}

		@GetMapping("/doTest4.do")
		public String eee() {
			return "test5";
		}
		
		@RequestMapping("/doTest5.do")
		public String fff(HttpServletRequest req, Model model) {
			String hostname = req.getRemoteHost();
			model.addAttribute("name", hostname);
			//return new ModelandView("test6", "name", host);
			return "data/test6";
		}
		
		@RequestMapping("/hello.do")
		@ResponseBody //view resolve 를 타지 않고 jsp 파일 없이 직접 return을 보냄
		public String ggg() {
			return "{'test':'value'}";
		}
		
		@RequestMapping("/hello2.do")
		public ModelAndView hhh(HttpSession hs, HttpServletRequest req, 
				HttpServletResponse resp, Model model) {
			Object obj = hs.getAttribute("memverVO");
			
			// req.getAttribute(name)
			return null;
		}
		
		
		
		
}

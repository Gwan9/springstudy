package kr.co.jhta.web.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class HomeController {
//	/ ==> /home => home.jsp
	@RequestMapping(value= {"/","/home"})
	public String hello() {
		System.out.println("hahahaha");
		log.info("logger test");
		
		return "home2";
	}
}

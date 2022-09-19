package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping("/helloboot")
	public ModelAndView hello() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("model", "헬로우부트프로젝트");
		mv.setViewName("hello");
		return mv;
	}
	
	@RequestMapping("/helloajax")
	@ResponseBody
	public String hello2() {
		return "{\"response\":\"부트에서ajax호출\"}";
	}
	
}

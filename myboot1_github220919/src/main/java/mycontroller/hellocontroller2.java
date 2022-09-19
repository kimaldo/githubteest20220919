package mycontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class hellocontroller2 {
	
	@RequestMapping("/helloboot2")
	public ModelAndView hello() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("model", "헬로우 부트 프로젝트");
		mv.setViewName("hello");
		return mv;
		
	}

}

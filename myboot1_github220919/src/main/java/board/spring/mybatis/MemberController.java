package board.spring.mybatis;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController {
	@Autowired
	@Qualifier("service")
	MemberService service;
	
@GetMapping("/boardlogin")	
public String loginform() {
	return "board/loginform";
}
	
@PostMapping("/boardlogin")	
public String loginprocess(String id, int password, HttpSession session, HttpServletRequest request) {
	//HttpSession session = request.getSession();
	List<MemberDTO> list = service.onemember(id);
	System.out.println( "'" + list.get(0).getId() + "'" );
	System.out.println( "'" + list.get(0).getPassword() + "'" );
	if(list.size()== 0) {
		//회원가입 안되어있다
	}
	else {
		int dbpassword = list.get(0).getPassword() ;
		if(dbpassword == password) {
			session.setAttribute("sessionid",  id);
		}
	}
	return "board/start";
}

@RequestMapping("/boardlogout")
public String logout(HttpServletRequest request) {
	HttpSession session = request.getSession();
	if(session.getAttribute("sessionid") != null) {
		session.removeAttribute("sessionid");
	}
	return "board/start";
}
}








package board.spring.mybatis;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BoardController {
	@Autowired
	@Qualifier("boardservice")
	BoardService service;
	
	@RequestMapping("/")
	public String start() {
		return "board/start";
	}
	
	@GetMapping("/boardwrite")
	public String writingform() {
		return "board/writingform";
	}
	
	@PostMapping("/boardwrite")
	public ModelAndView writingprocess(BoardDTO dto) {
		//title, contents, writer, pw 저장 상태
		//dto.setViewcount(0);
		
		int insertcount = service.registerBoard(dto);
		ModelAndView mv = new ModelAndView();
		mv.addObject("insertcount", insertcount);
		mv.setViewName("board/writingprocess");
		return mv;
	}
	@RequestMapping("/boardlist")
	public ModelAndView boardlist
	(@RequestParam(value="page",
			required=false, defaultValue="1") int page) {
		int totalcount = service.getTotalBoard();
		List<BoardDTO> boardlist = service.getBoardList( (page -1)*3 );//  1->0 , 2->3
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("totalcount", totalcount );
		mv.addObject("boardlist", boardlist);
		mv.setViewName("board/list");
		return mv;
		//전체 게시물 갯수 리턴
		// 페이지번호 따른 3개씩 리턴
	}
	
	@RequestMapping("/boarddetail")
	public ModelAndView getDetail(int seq) {
		BoardDTO dto = service.updateAndGetDetail(seq);
		ModelAndView mv = new ModelAndView();
		mv.addObject("detail", dto);
		mv.setViewName("board/detail");
		return mv;
	}
	
	@RequestMapping("/boarddelete")
	String deleteBoard(int seq){
	   service.deleteBoard(seq);
	   return "redirect:/boardlist";
	   // boardlist 매핑 컨트롤러 메소드 실행 - model - view
	   //return "board/list";  //뷰응답(list.jsp만 호출 파라미터 전달못해서오류)
	}
	
	@GetMapping("/boardupdate")
	ModelAndView updateBoard(int seq) {
		//seq 글 조회 BoardDTO -모델 - 뷰 폼 미리 보여주자
		BoardDTO dto = service.getDetail(seq);
		ModelAndView mv = new ModelAndView();
		mv.addObject("updateform", dto);
		mv.setViewName("board/updateform");
		return mv;

	}

	@PostMapping("/boardupdate")
	String updateBoard(BoardDTO dto) {
		service.updateBoard(dto);
		return "redirect:/boardlist";

	}
	
}




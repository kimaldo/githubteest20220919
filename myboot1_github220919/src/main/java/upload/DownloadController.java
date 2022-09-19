package upload;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DownloadController {

	//  c:upload 폴더 파일 리스트 보여주는 뷰 이동 메소드
	@RequestMapping("/filedownloadlist")
	public ModelAndView downloadlist() {
		File f = new File("c:/upload"); //디렉토리와 파일 접근 가능 정보 객체
		String [] filearray = f.list(); //파일목록 String[] 로 리턴
		ModelAndView mv = new ModelAndView();
		mv.addObject("filearray", filearray);
		mv.setViewName("upload/downloadlist");
		return mv;
	}
	//선택한 파일을 다운로드 메소드
	@RequestMapping("/filedownloadresult")
	public void downloadresult(String filename , HttpServletResponse response)
	throws IOException {
		//void 리턴타입이면 url 동일명 jsp 
		//web-inf/views/filedownloadresult.jsp
		//response.setContentType("text/html;charset=utf-8);--> html 문서 브라우저 실행
		
		//void 리턴타입이면 다운로드-뷰 없다
		// c:/upload/ + filename
		File f = new File("c:/upload/" + filename);
		int len = (int)f.length();//byte
		
		response.setContentType("application/download");
		response.setContentLength(len);
		response.setHeader("Content-Disposition", "attachment;filename=\"" + filename + "\"");

		OutputStream out = response.getOutputStream();//브라우저 응답
		FileInputStream fin = new FileInputStream(f);//파일로 입력 객체 생성
		FileCopyUtils.copy(fin, out);// fin(다운로드파일내용) --> out(브라우저) 복사
		fin.close();
		out.close();
		
		

	}
	
}





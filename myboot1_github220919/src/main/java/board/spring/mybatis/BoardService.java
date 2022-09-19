package board.spring.mybatis;

import java.util.List;

public interface BoardService {
	//글쓰기능
	public int registerBoard(BoardDTO dto) ;
	//게시물페이징리스트
	public int getTotalBoard();
	public List<BoardDTO> getBoardList(int limit);
	//상세게시물보기기능
	public BoardDTO updateAndGetDetail(int seq);
	//삭제
	public void deleteBoard(int seq);
	//수정폼
	public BoardDTO getDetail(int seq);
	//수정처리
	public void updateBoard(BoardDTO dto);
	
	
	
}

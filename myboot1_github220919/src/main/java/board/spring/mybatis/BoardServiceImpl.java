package board.spring.mybatis;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("boardservice")
public class BoardServiceImpl implements BoardService{
	@Autowired
	BoardDAO dao;
	
	@Override
	public int registerBoard(BoardDTO dto) {
		return dao.insertBoard(dto);
	}

	@Override
	public int getTotalBoard() {
		return dao.getTotalBoard();
	}

	@Override
	public List<BoardDTO> getBoardList(int limit) {
		return dao.getBoardList(limit);
	}

	@Override
	public BoardDTO updateAndGetDetail(int seq) {
		dao.updateViewcount(seq);
		return dao.getDetail(seq);
	}

	@Override
	public void deleteBoard(int seq) {
		dao.deleteBoard(seq);
		
	}

	@Override
	public BoardDTO getDetail(int seq) {
		return dao.getDetail(seq);
	}

	@Override
	public void updateBoard(BoardDTO dto) {
		dao.updateBoard(dto);
		
	}
	
	
	

}

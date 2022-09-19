package board.spring.mybatis;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository("boarddao")
public interface BoardDAO {
	
	public int insertBoard(BoardDTO dto) ;
	
	public int getTotalBoard() ;
	
	public List<BoardDTO> getBoardList(int limit) ;
	
	public void updateViewcount(int seq) ;
	
	public BoardDTO getDetail(int seq) ;
	
	public void deleteBoard(int seq) ;
	
	public void updateBoard(BoardDTO dto) ;
}







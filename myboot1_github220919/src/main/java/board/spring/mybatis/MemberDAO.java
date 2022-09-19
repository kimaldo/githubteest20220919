package board.spring.mybatis;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository("dao")
public interface MemberDAO {
	
	public List<MemberDTO> getList();
	public int getCount() ;
	public List<MemberDTO> oneMember(String id);
	public List<MemberDTO> pagingList(int[] limit);
	public int insertMember(MemberDTO dto) ;
	public int updateMember(MemberDTO dto) ;
	public int deleteMember(String id) ;
	public List<MemberDTO> searchList(MemberDTO dto);

}






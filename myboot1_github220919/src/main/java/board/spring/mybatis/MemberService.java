package board.spring.mybatis;

import java.util.List;

public interface MemberService {
	public List<MemberDTO> memberlist();
	public List<MemberDTO> onemember(String id);
	public List<MemberDTO> paginglist(int[] limit);
	public int registerMember(MemberDTO dto);
	public int updateMember(MemberDTO dto);
	public int deleteMember(String id);
	public int getTotalMember();
	public List<MemberDTO> searchlist(MemberDTO dto);

	
}

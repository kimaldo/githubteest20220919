package board.spring.mybatis;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("service")
public class MemberServiceImpl implements MemberService{
	@Autowired
	MemberDAO dao;
	
	@Override
	public List<MemberDTO> memberlist() {
		List<MemberDTO> list = dao.getList();
		int count = dao.getCount();
		
		list.add(new MemberDTO(null, count, null, null, null, null));
		
		return list; //main 결과 리턴 - 갯수 마지막 객체 암호 포함 
	}

	@Override
	public List<MemberDTO> onemember(String id) {
		return dao.oneMember(id);
	}

	@Override
	public List<MemberDTO> paginglist(int[] limit) {
		return dao.pagingList(limit);
	}

	//회원가입
	@Override
	public int registerMember(MemberDTO dto) {
		//dto.getId() 조회해본다. 
		List<MemberDTO> list = dao.oneMember(dto.getId());
		//조회결과 있는지 확인한다
		if(list == null || list.size() == 0) {
			return dao.insertMember(dto);
		}
		else {
			return 0;
		}
	}

	//회원정보수정
	@Override
	public int updateMember(MemberDTO dto) {
		List<MemberDTO> list = dao.oneMember(dto.getId());
		if(list.size() > 0) {
			return dao.updateMember(dto);
		}
		else {
			return 0;
		}
	}
	//회원삭제
	@Override
	public int deleteMember(String id) {
		List<MemberDTO> list = dao.oneMember(id);
		if(list.size() > 0) {
			return dao.deleteMember(id);
		}
		else {
			return 0;
		}
	}
	
	public int getTotalMember() {
		return dao.getCount();
	}

	@Override
	public List<MemberDTO> searchlist(MemberDTO dto) {
		return dao.searchList(dto);
	}

	
	
	
	
	
	
}

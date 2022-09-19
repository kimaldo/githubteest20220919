package upload;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper // mapper 객체 사용 인식
@Repository("uploaddao") // new 객체 생성
public interface UploadDAO {
	public int insertUpload(UploadDTO dto);
	public List<UploadDTO> selectUpload(String name);
}

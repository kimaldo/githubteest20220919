package upload;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("uploadservice1")
public class UploadServiceImpl implements UploadService {
	
	@Autowired
	UploadDAO dao;
	
	@Override
	public int register(UploadDTO dto) {
		// dao.selectName(dto);
		return dao.insertUpload(dto);
	}

	@Override
	public List<UploadDTO> get(String name) {
		return dao.selectUpload(name);
	}
	
	
}

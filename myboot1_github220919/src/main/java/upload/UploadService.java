package upload;

import java.util.List;

public interface UploadService {
	public int register(UploadDTO dto);
	public List<UploadDTO> get(String name);
}

package upload;

import org.springframework.web.multipart.MultipartFile;
/*
 * -- upload패키지 파일업로드 구현 완료. c:/upload
-- upload하면 파일1 내용은 c:/upload에 저장. uuid 사용한 저장한 파일명 db upload file1 저장
-- upload하면 파일2 내용은 c:/upload에 저장. uuid 사용한 저장한 파일명 db upload file2 저장
-- UploadDTO - String uploadtime 변수 / setter / getter 메소드 추가
 * 
 * */
public class UploadDTO {
	String name, description;
	MultipartFile file1, file2;
	String uploadtime;
	String filename1, filename2;
	
	
	public String getFilename1() {
		return filename1;
	}
	public void setFilename1(String filename1) {
		this.filename1 = filename1; // 컨트롤러에서 전송 파일 변경
	}
	public String getFilename2() {
		return filename2;
	}
	public void setFilename2(String filename2) {
		this.filename2 = filename2;
	}
	public String getUploadtime() {
		return uploadtime;
	}
	public void setUploadtime(String uploadtime) {
		this.uploadtime = uploadtime;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public MultipartFile getFile1() {
		return file1;
	}
	public void setFile1(MultipartFile file1) {
		this.file1 = file1;
	}
	public MultipartFile getFile2() {
		return file2;
	}
	public void setFile2(MultipartFile file2) {
		this.file2 = file2;
	}
	
}

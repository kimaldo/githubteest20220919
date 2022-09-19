package board.spring.mybatis;
//JDBC -- MYBATIS

public class MemberDTO {
	String id; // varchar(30) 
	int password;// int 
	String name;// varchar(30) 
	String phone; //char(13) 
	String email; // varchar(30) 
	String regdate;
	//기본생성자 수동정의 - <jsp:useBean 기본생성자호출 
	public MemberDTO(){ }
	//매개변수 생성자 수동정의 - <jsp:useBean 태그에서 사용 불가
	public MemberDTO(String id, int password, String name, String phone, String email, String regdate) {
		super();
		this.id = id;
		this.password = password;
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.regdate = regdate;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getPassword() {
		return password;
	}
	public void setPassword(int password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRegdate() {
		return regdate;
	}
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	@Override
	public String toString() {
		return id + " 회원님의 이름은 " + name + " , 폰번호는 " + phone + " , 이메일은 " + email
			+ " , 가입일은 " + regdate + " 입니다.";	
	}

	
	
}

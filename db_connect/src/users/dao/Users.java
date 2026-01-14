package users.dao;
//DTO 정의
public class Users {
	private String userId;        //아이디
	private String userPassword;  //비밀번호
	private String userName;      //이름
	private int userAge;          //나이
	
	//getter, setter 메서드 정의
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getUserPassword() {
		return userPassword;
	}
	
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	
	public int getUserAge() {
		return userAge;
	}
	
	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}

	//객체 정보를 문자열로 리턴
	@Override
	public String toString() {
		return "Users [userId=" + userId + ", userPassword=" + userPassword 
				+ ", userName=" + userName + ", userAge=" + userAge + "]";
	}
}

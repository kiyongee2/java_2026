package users.main;

import java.util.List;

import users.dao.UserDAO;
import users.dao.Users;

public class UserMain {

	public static void main(String[] args) {
		
		UserDAO dao = new UserDAO();
		
		//회원 1명 등록
		/*Users newUser = new Users();  // User 인스턴스 생성
		newUser.setUserId("cloud");
		newUser.setUserPassword("c1234");
		newUser.setUserName("임시현");
		newUser.setUserAge(22);
		
		dao.insertUsers(newUser); //메서드 호출
		System.out.println("회원 등록 완료!");*/
		
		//회원 수정
		/*Users renewUser = new Users();
		renewUser.setUserId("today");
		renewUser.setUserPassword("t1234");
		renewUser.setUserName("투데이");
	    renewUser.setUserAge(30);
		
		dao.updateUser(renewUser);*/
		
		//회원 삭제
		dao.deleteUser("hangang");
		
		//회원 목록 출력
		List<Users> userList = dao.getUserList();
		for(int i = 0; i < userList.size(); i++) {
			Users user = userList.get(i);
			System.out.println(user);
		}
		
		//회원 1명 검색(상세 보기)
		/*Users findUser = dao.getUser("today");
		System.out.println(findUser);*/
	}
}





package users.main;

import java.util.ArrayList;
import java.util.List;

import users.dao.UserDAO;
import users.dao.Users;

public class UserMain {

	public static void main(String[] args) {
		Users newUser = new Users();    //회원 객체 생성
		UserDAO dao = new UserDAO(); //회원 관리 객체 생성
		
		//회원 추가
		/*newUser.setUserId("today");
		newUser.setUserPassword("t135##");
		newUser.setUserName("투데이");
		newUser.setUserAge(6);
		
		dao.insertUser(newUser); //db에 회원 추가
		System.out.println("회원 1명 저장 완료!");*/
		
		//회원 상세 보기
		/*Users user = dao.getUser("cloud");
		System.out.println(user);*/
		
		//회원 정보 수정
		/*Users renewUser = new Users();
		renewUser.setUserId("today");
		renewUser.setUserPassword("t135##");
		renewUser.setUserName("박이슬");
		renewUser.setUserAge(30);
		
		dao.updateUser(renewUser);
		System.out.println("회원 정보 수정 완료!"); */
		
		//회원 삭제
		/*dao.deleteUser("today");
		System.out.println("회원 정보 삭제 완료!");*/
		
		//회원 목록
		List<Users> userList = dao.getUserList();
		for(int i = 0; i < userList.size(); i++) {
			Users findUser = userList.get(i);
			System.out.println(findUser);
		}
	}
}










package userstest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import users.dao.Users;


public class UsersSelectAllTest {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			// jdbc 드라이버 등록
			Class.forName("oracle.jdbc.OracleDriver");
			// 연결
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521/xe",
					"system",
					"pw1234");
			
			// sql - 전체 회원 검색
			String sql = "SELECT * FROM users";
			pstmt = conn.prepareStatement(sql);
		
			ResultSet rs = pstmt.executeQuery(); //검색된 데이터 셋 객체 생성
			List<Users> userList = new ArrayList<>(); //ArrayList 자료구조 생성
			
			while(rs.next()) {
				Users user = new Users();  //회원 객체 생성
				
				user.setUserId(rs.getString("userid"));
				user.setUserPassword(rs.getString("userpassword"));
				user.setUserName(rs.getString("username"));
				user.setUserAge(rs.getInt("userage"));
				
				userList.add(user); //리스트에 회원 객체 추가 저장
			}
			for(int i=0; i<userList.size(); i++) {
				Users user = userList.get(i);  //리스트에서 객체 가져와서
				System.out.println(user);      //객체 정보 출력
				
				/*System.out.println("===============================");
				System.out.println("userId: " + user.getUserId());
				System.out.println("userPassword: " + user.getUserPassword());
				System.out.println("userName: " + user.getUserName());
				System.out.println("userAge: " + user.getUserAge());*/
			}
			
			rs.close();    //rs 종료
			pstmt.close(); //pstmt 종료
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(conn != null) {
				try {
					conn.close(); //conn 종료
					System.out.println("연결 끊음");
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}

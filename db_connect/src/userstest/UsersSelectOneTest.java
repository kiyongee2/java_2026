package userstest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import users.dao.Users;

public class UsersSelectOneTest {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			// db 연결
			Class.forName("oracle.jdbc.OracleDriver");
			
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521/xe",
					"system",
					"pw1234");
			
			// sql - 1건 검색
			String sql = "SELECT * FROM users WHERE userid = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "cloud"); //? - 1개 
		
			ResultSet rs = pstmt.executeQuery();  //검색된 객체 생성
			
			if(rs.next()) {
				Users user = new Users(); //회원 객체 생성
				
				user.setUserId(rs.getString("userid")); //db 필드에서 가져와서 아이디 설정
				user.setUserPassword(rs.getString("userpassword"));
				user.setUserName(rs.getString("username"));
				user.setUserAge(rs.getInt("userage"));
				
				System.out.println("userId: " + user.getUserId());
				System.out.println("userPassword: " + user.getUserPassword());
				System.out.println("userName: " + user.getUserName());
				System.out.println("userAge: " + user.getUserAge());
				
				/*
				String userId = rs.getString("userid");
				String userPassword = rs.getString("userpassword");
				String userName = rs.getString("username");
				int userAge = rs.getInt("userage");
				
				System.out.println("userId: " + userId);
				System.out.println("userPassword: " + userPassword);
				System.out.println("userName: " + userName);
				System.out.println("userAge: " + userAge);
				*/
			}else {
				System.out.println("아이디가 존재하지 않습니다.");
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(conn != null) {
				try {
					conn.close();
					System.out.println("연결 끊음");
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}

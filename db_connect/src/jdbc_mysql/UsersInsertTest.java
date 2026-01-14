package jdbc_mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UsersInsertTest {

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			// jdbc 드라이버 등록
			Class.forName("com.mysql.cj.jdbc.Driver");
			// 연결
			conn = DriverManager.getConnection(
					"jdbc:mysql://127.0.0.1:3306/javadb?serverTime=Asia/Seoul",
					"javauser",
					"pwjava");
			System.out.println(conn + "DB 연결 성공!!");
			
			// db 작업 - 추가
			String sql = "INSERT INTO users(userid, userpassword, username, userage) "
					+ "VALUES (?, ?, ?, ?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "jerry");
			pstmt.setString(2, "k5901");
			pstmt.setString(3, "김기용");
			pstmt.setInt(4, 55);
			
			// sql 실행
			int rows = pstmt.executeUpdate();
			System.out.println("저장된 행의 수: " + rows);
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

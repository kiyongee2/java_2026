package userstest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UsersInsertTest {
	public static void main(String[] args) {
		Connection conn = null;         //연결 객체 선언
		PreparedStatement pstmt = null; //sql 작업 객체 선언
		
		try {
			// db 연결
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521/xe",
					"system",
					"pw1234");
	
			// sql 작성 - 회원 추가('?' - 동적 바인딩 기호)
			String sql = "INSERT INTO users(userid, userpassword, username, userage) "
					+ "VALUES (?, ?, ?, ?)";
			pstmt = conn.prepareStatement(sql); //sql을 매개변수로 전달
			pstmt.setString(1, "cloud");  //setString(인덱스, 문자값)
			pstmt.setString(2, "c3355@!");
			pstmt.setString(3, "임시현");
			pstmt.setInt(4, 22);          //setInt(인덱스, 숫자값)
			
			int rows = pstmt.executeUpdate(); // sql 실행(삽입, 수정, 삭제시)
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

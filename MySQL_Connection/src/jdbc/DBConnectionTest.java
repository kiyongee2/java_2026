package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnectionTest {
	//static{} - 정적 초기화 블럭
	static {
		try {
			//클래스 로딩 시 드라이버 등록
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	static String url = "jdbc:mysql://localhost:3306/javadb"; //DB
	static String username = "javauser"; //사용자 계정
	static String password = "pwjava";   //비밀번호

	public static void main(String[] args) {
		//try ~ with ~ resource문
		try(Connection conn = DriverManager.getConnection(url, username, password)){
			System.out.println(conn + "DB 접속 성공!!");
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
}

package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionTest {

	public static void main(String[] args) {
		
		Connection conn = null; //Connection 인스턴스 생성
		
		try {
			//mysql driver 클래스 이름
			Class.forName("com.mysql.cj.jdbc.Driver"); 
			
			//접속
			conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/javadb", //db의 url
					"javauser",  //username 계정
					"pwjava"     //password
					);
			
			System.out.println(conn + "DB 접속 성공!!");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
 
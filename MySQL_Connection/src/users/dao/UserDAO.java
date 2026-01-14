package users.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDAO {
	//static{} - 정적 초기화 블럭
	static {
		try {
			//클래스 로딩 시 드라이버 등록
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	static String url = "jdbc:mysql://localhost:3306/javadb";
	static String username = "javauser";
	static String password = "pwjava";
	
	//회원 등록
	public void insertUsers(Users user) {
		//SQL - DML(삽입 구문)
		String sql = "insert into users(userid, userpassword, username, userage) "
				+ "values (?, ?, ?, ?)";
		
		//conn(연결 객체), pstmt(sql 처리 객체)
		try(Connection conn = DriverManager.getConnection(url, username, password);
			PreparedStatement pstmt = conn.prepareStatement(sql)){
			
			//1번 부터 시작 순서대로 바인딩.
			pstmt.setString(1, user.getUserId());
			pstmt.setString(2, user.getUserPassword());
			pstmt.setString(3, user.getUserName());
			pstmt.setInt(4, user.getUserAge());
			
			pstmt.executeUpdate();  //sql 실행(커밋)
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	//회원 목록 보기
	public List<Users> getUserList(){
		String sql = "select * from users";
		List<Users> userList = new ArrayList<>();
		
		try(Connection conn = DriverManager.getConnection(url, username, password);
				PreparedStatement pstmt = conn.prepareStatement(sql);
				//db에서 데이터 검색
				ResultSet rs = pstmt.executeQuery()){
			
			while(rs.next()) {
				Users user = new Users(); //user 인스턴스 생성
				user.setUserId(rs.getString("userid")); //db의 userid 칼럼 가져옴
				user.setUserPassword(rs.getString("userpassword"));
				user.setUserName(rs.getString("username"));
				user.setUserAge(rs.getInt("userage"));
				
				userList.add(user);  //userList에 user 1건 저장
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return userList;  //회원 목록(userList) 반환
	}
	
	//회원 1명 검색(상세 보기)
	public Users getUser(String userId) {
		String sql = "select * from users where userid = ?";
		Users user = new Users();
		
		try(Connection conn = DriverManager.getConnection(url, username, password);
				PreparedStatement pstmt = conn.prepareStatement(sql)){
			pstmt.setString(1, userId); //실행 화면에서 입력된 아이디 바인딩
			
			try(ResultSet rs = pstmt.executeQuery()){ //db에서 자료 검색
				if(rs.next()) {
					user.setUserId(rs.getString("userid")); //db의 userid 칼럼 가져옴
					user.setUserPassword(rs.getString("userpassword"));
					user.setUserName(rs.getString("username"));
					user.setUserAge(rs.getInt("userage"));
				}
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return user; //회원(user) 반환
	}
	
	//회원 수정
	public void updateUser(Users user) {
		String sql = "update users set userpassword = ?, username = ?, "
				+ "userage = ? where userid = ?";
		
		try(Connection conn = DriverManager.getConnection(url, username, password);
			PreparedStatement pstmt = conn.prepareStatement(sql)){
			
			pstmt.setString(1, user.getUserPassword());
			pstmt.setString(2, user.getUserName());
			pstmt.setInt(3, user.getUserAge());
			pstmt.setString(4, user.getUserId());
			
			pstmt.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	//회원 삭제
	public void deleteUser(String userId) {
		String sql = "delete from users where userid = ?";
		
		try(Connection conn = DriverManager.getConnection(url, username, password);
			PreparedStatement pstmt = conn.prepareStatement(sql)){
			
			pstmt.setString(1, userId);  //입력된 아이디 바인딩
			
			pstmt.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
}//class 닫기












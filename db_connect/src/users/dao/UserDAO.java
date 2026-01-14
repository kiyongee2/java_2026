package users.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDAO {
	
	static {
		try {
			// 클래스 로딩시 드라이버 등록 
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	static String url = "jdbc:oracle:thin:@localhost:1521/xe"; //db 경로
	static String username = "system";  //사용자 계정명
	static String password = "pw1234";  //사용자 비밀번호
	
	//회원 생성
	public void insertUser(Users user) {
		//SQL - DML(삽입 구문)
		String sql = "INSERT INTO users(userid, userpassword, username, userage) "
				+ "VALUES (?, ?, ?, ?)";
		
		//Connection 객체(db 연결), PreparedStatement 객체(sql 처리) 생성
		try(Connection conn = DriverManager.getConnection(url, username, password);
			PreparedStatement pstmt = conn.prepareStatement(sql)){
			
			pstmt.setString(1, user.getUserId());  //메인(화면)에서 입력된 아이디 가져옴
			pstmt.setString(2, user.getUserPassword()); //비밀번호 
			pstmt.setString(3, user.getUserName());     //이름
			pstmt.setInt(4, user.getUserAge());         //나이
			
			pstmt.executeUpdate();  //sql 실행(커밋)
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	//회원 목록 검색
	public List<Users> getUserList() {
		//SQL - DML(검색 구문)
		String sql = "SELECT * FROM users";
		//검색된 user를 저장할 리스트 객체 생성
		List<Users> userList = new ArrayList<>(); 
		
		//ResultSet rs 객체(db에서 가져온 자료)
		try(Connection conn = DriverManager.getConnection(url, username, password);
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery()){
			
			while(rs.next()) { //검색된 자료가 있는 동안 계속
				Users user = new Users();
				user.setUserId(rs.getString("userid"));  //db에서 가져온 아이디를 보기를 위해 설정
				user.setUserPassword(rs.getString("userpassword"));  //비밀번호(문자형)
				user.setUserName(rs.getString("username"));          //이름(문자형)
				user.setUserAge(rs.getInt("userage"));               //나이(정수형)
			
				userList.add(user); //user 객체를 리스트에 저장
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return userList;  //리스트를 반환함
	}
			
	//회원 1명 검색(상세 보기)
	public Users getUser(String userId) {
		//SQL - DML(검색 구문)
		String sql = "SELECT * FROM users WHERE userid = ?";
		Users user = new Users(); //검색 결과를 보여줄 user 객체 생성
		
		try(Connection conn = DriverManager.getConnection(url, username, password);
			PreparedStatement pstmt = conn.prepareStatement(sql)){
			pstmt.setString(1, userId); //실행 화면에서 입력된 아이디 설정
			
			try(ResultSet rs = pstmt.executeQuery()){ //검색된 자료 자료가 객체 생성
				if(rs.next()) { //검색된 자료가 있으면
					user.setUserId(rs.getString("userid"));
					user.setUserPassword(rs.getString("userpassword"));
					user.setUserName(rs.getString("username"));
					user.setUserAge(rs.getInt("userage"));
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		return user; //user 객체 반환
	}
	
	//회원 정보 수정
	public void updateUser(Users user) {
		//SQL - DML(수정 구문)
		String sql = "UPDATE users SET userpassword = ?, username = ?, userage = ? "
				+ "WHERE userid = ?";
		
		try(Connection conn = DriverManager.getConnection(url, username, password);
			PreparedStatement pstmt = conn.prepareStatement(sql)){
			
			pstmt.setString(1, user.getUserPassword());
			pstmt.setString(2, user.getUserName());
			pstmt.setInt(3, user.getUserAge());
			pstmt.setString(4, user.getUserId());
			
			pstmt.executeUpdate();  //sql 실행(커밋)
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	//회원 정보 삭제
	public void deleteUser(String userId) {
		//SQL - DML(삭제 구문)
		String sql = "DELETE FROM users WHERE userid = ?";
		
		try(Connection conn = DriverManager.getConnection(url, username, password);
			PreparedStatement pstmt = conn.prepareStatement(sql)){
			pstmt.setString(1, userId); //외부 입력된 아이디
			
			pstmt.executeUpdate();  //sql 실행(커밋)
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}

























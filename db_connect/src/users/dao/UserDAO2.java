package users.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDAO2 {
	//db 연결
	private static String driver = "oracle.jdbc.OracleDriver";
	private static String url = "jdbc:oracle:thin:@localhost:1521/xe";
	private static String username = "system";
	private static String password = "1234!@#$";
	
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	
	public void connDB() {
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, username, password);
			//System.out.println(conn + ", db 연결됨");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void disconnect() {
		if(pstmt != null) {
			try {
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if(conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void disconnectRS() {
		if(rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if(pstmt != null) {
			try {
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if(conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	//회원 생성
	public void insertUser(Users user) {
		
		connDB(); //db 연결
		String sql = "INSERT INTO users(userid, userpassword, username, userage) "
				+ "VALUES (?, ?, ?, ?)";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, user.getUserId());
			pstmt.setString(2, user.getUserPassword());
			pstmt.setString(3, user.getUserName());
			pstmt.setInt(4, user.getUserAge());
			
			pstmt.executeUpdate();  //sql 실행(커밋)
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}
	
	//회원 목록 검색
	public List<Users> getUserList() {
		List<Users> userList = new ArrayList<>();
		connDB();
		String sql = "SELECT * FROM users";
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				Users user = new Users();
				user.setUserId(rs.getString("userid"));
				user.setUserPassword(rs.getString("userpassword"));
				user.setUserName(rs.getString("username"));
				user.setUserAge(rs.getInt("userage"));
			
				userList.add(user);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnectRS();
		}
		
		return userList;
	}
	
	//회원 1명 검색(상세 보기)
	public Users getUser(String userId) {
		Users user = new Users();
		connDB();
		String sql = "SELECT * FROM users WHERE userid = ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, userId);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				user.setUserId(rs.getString("userid"));
				user.setUserPassword(rs.getString("userpassword"));
				user.setUserName(rs.getString("username"));
				user.setUserAge(rs.getInt("userage"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnectRS();
		}
		
		return user;
	}
	
	//회원 정보 수정
	public void updateUser(Users user) {
		
		connDB(); //db 연결
		String sql = "UPDATE users SET userpassword = ?, username = ?, userage = ? "
				+ "WHERE userid = ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, user.getUserPassword());
			pstmt.setString(2, user.getUserName());
			pstmt.setInt(3, user.getUserAge());
			pstmt.setString(4, user.getUserId());
			
			pstmt.executeUpdate();  //sql 실행(커밋)
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}
	
	//회원 정보 삭제
	public void deleteUser(String userId) {
		
		connDB(); //db 연결
		String sql = "DELETE FROM users WHERE userid = ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, userId);
			
			pstmt.executeUpdate();  //sql 실행(커밋)
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}
}

























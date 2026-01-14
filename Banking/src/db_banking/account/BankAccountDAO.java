package db_banking.account;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class BankAccountDAO {
	static {
		try {
			// 클래스 로딩시 드라이버 등록 
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	static String url = "jdbc:oracle:thin:@localhost:1521/xe"; //db 경로
	static String username = "javauser";  //사용자 계정명
	static String password = "pwjava";  //사용자 비밀번호
	
	//계좌 생성
	public void createAccount(BankAccount account) {
		//SQL - DML(삽입 구문)
		String sql = "INSERT INTO bank_account VALUES (?, ?, ?)";
		
		//Connection 객체(db 연결), PreparedStatement 객체(sql 처리) 생성
		try(Connection conn = DriverManager.getConnection(url, username, password);
			PreparedStatement pstmt = conn.prepareStatement(sql)){
			
			pstmt.setString(1, account.getAno());
			pstmt.setString(2, account.getOwner());
			pstmt.setInt(3, account.getBalance());
			
			pstmt.executeUpdate();  //sql 실행(커밋)
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public List<BankAccount> getAccountList() {
		//SQL - DML(검색 구문)
		String sql = "SELECT * FROM bank_account";
		//검색된 user를 저장할 리스트 객체 생성
		List<BankAccount> accountList = new ArrayList<>(); 
		
		//ResultSet rs 객체(db에서 가져온 자료)
		try(Connection conn = DriverManager.getConnection(url, username, password);
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery()){
			
			while(rs.next()) { //검색된 자료가 있는 동안 계속
				String ano = rs.getString("ano");
				String owner = rs.getString("owner");
				int balance = rs.getInt("balance");
				
				BankAccount account = new BankAccount(ano, owner, balance);
				accountList.add(account); //user 객체를 리스트에 저장
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return accountList;  //리스트를 반환함
	}
	
	public BankAccount findAccount(String ano) {
		//SQL - DML(검색 구문)
		String sql = "SELECT * FROM bank_account WHERE ano = ?";
		//검색된 account를 저장할 리스트 객체 생성
		BankAccount account = null;
		
		//ResultSet rs 객체(db에서 가져온 자료)
		try(Connection conn = DriverManager.getConnection(url, username, password);
			PreparedStatement pstmt = conn.prepareStatement(sql)){
			pstmt.setString(1, ano);
			
			try(ResultSet rs = pstmt.executeQuery()){
				if(rs.next()) { //검색된 자료가 있는 동안 계속
					ano = rs.getString("ano");
					String owner = rs.getString("owner");
					int balance = rs.getInt("balance");
					account = new BankAccount(ano, owner, balance); //계좌 생성
				}
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return account;  //리스트를 반환함
	}
	
	//입금
	public void deposit(String ano, int money) { //계좌번호, 입금액
		BankAccount account = findAccount(ano);
		String owner = account.getOwner();
		int balance = account.getBalance() + money; //잔고 + 입금액
		
		//sql - 계좌 수정
		String sql = "UPDATE bank_account SET owner = ?, balance = ? WHERE ano = ?";
		try(Connection conn = DriverManager.getConnection(url, username, password);
			PreparedStatement pstmt = conn.prepareStatement(sql)){
			
			pstmt.setString(1, owner);
			pstmt.setInt(2, balance);
			pstmt.setString(3, ano);
			
			pstmt.executeUpdate();  //sql 실행(커밋)
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	//출금
	public void withdraw(String ano, int money) { //계좌번호, 출금액
		BankAccount account = findAccount(ano);
		String owner = account.getOwner();
		int balance = account.getBalance() - money; //잔고 - 출금액
		
		//sql - 계좌 수정
		String sql = "UPDATE bank_account SET owner = ?, balance = ? WHERE ano = ?";
		try(Connection conn = DriverManager.getConnection(url, username, password);
			PreparedStatement pstmt = conn.prepareStatement(sql)){
			
			pstmt.setString(1, owner);
			pstmt.setInt(2, balance);
			pstmt.setString(3, ano);
			
			pstmt.executeUpdate();  //sql 실행(커밋)
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
}

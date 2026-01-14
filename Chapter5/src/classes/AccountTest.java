package classes;

public class AccountTest {

	public static void main(String[] args) {
		
		//Account 객체 생성 - 기본 생성자
		Account account1 = new Account(); 
		//account1.ano = "111-222";  //private 멤버에 접근 불가
		
		//데이터 입력
		account1.setAno("111-222");
		account1.setOwner("나저축");
		account1.setBalance(10000);
		
		//데이터 출력
		System.out.println("계좌번호: " + account1.getAno());
		System.out.println("계좌주: " + account1.getOwner());
		System.out.println("잔고: " + account1.getBalance());
		System.out.println("=======================");
		
		//생성자 매개변수 외부 입력으로 객체 생성
		Account account2 = new Account("333-444", "최금리", 20000);
		
		//데이터 출력
		System.out.println("계좌번호: " + account2.getAno());
		System.out.println("계좌주: " + account2.getOwner());
		System.out.println("잔고: " + account2.getBalance());
		System.out.println("=======================");
	}

}

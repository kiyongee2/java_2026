package obj_arrays;

public class BookArray {

	public static void main(String[] args) {
		//객체 배열 생성 방법 1
		/*Book[] books = new Book[3];
		 
		//null 출력
		for(int i=0; i<books.length; i++) {
			System.out.println(books[i]);
		} 
		
		//Book 객체 생성
		Book book1 = new Book(100, "채식주의자", "한강");
		Book book2 = new Book(101, "자바프로그래밍 입문", "박은종");
		Book book3 = new Book(102, "모두의 파이썬", "이승찬");
		
		books[0] = book1;
		books[1] = book2;
		books[2] = book3;
		
		//특정 객체 검색
		books[0].showBookInfo();
		
		//전체 출력
		for(int i=0; i<books.length; i++) {
			books[i].showBookInfo();
		}*/
		
		//객체 배열 생성 방법 2
		/*Book[] books = new Book[3];
		
		//배열의 저장
		books[0] = new Book(100, "채식주의자", "한강");
		books[1] = new Book(101, "자바프로그래밍 입문", "박은종");
		books[2] = new Book(102, "모두의 파이썬", "이승찬");*/
		
		//객체 배열 생성 방법 3
		Book[] books = {
				new Book(100, "채식주의자", "한강"),
				new Book(101, "자바프로그래밍 입문", "박은종"),
				new Book(102, "모두의 파이썬", "이승찬")
		};
		
		//전체 출력
		for(int i=0; i<books.length; i++) {
			books[i].showBookInfo();
		}
	}
}

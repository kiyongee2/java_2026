package arraylist;

import java.util.ArrayList;

import obj_arrays.Book;

public class BookList {

	public static void main(String[] args) {
		// ArrayList에 Book 객체 저장
		ArrayList<Book> bookList = new ArrayList<>();
		
		bookList.add(new Book(100, "채식주의자", "한강"));
		bookList.add(new Book(101, "자바프로그래밍 입문", "박은종"));
		bookList.add(new Book(102, "모두의 파이썬", "이승찬"));
		
		for(int i=0; i<bookList.size(); i++) {
			Book book = bookList.get(i);
			book.showBookInfo();
		}
		System.out.println("===========================");
		
		for(Book book : bookList)
			book.showBookInfo();

	}

}

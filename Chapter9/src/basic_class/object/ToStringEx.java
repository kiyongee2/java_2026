package basic_class.object;

public class ToStringEx {

	public static void main(String[] args) {
		
		String name = new String("이순신");
		System.out.println(name);
		
		Book book = new Book(100, "개미");
		System.out.println(book);
		System.out.println(book.toString());
	}
}

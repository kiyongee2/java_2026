package basic_class.object;

public class HashCodeTest {

	public static void main(String[] args) {
		//String 객체 생성
		String name1 = new String("한강");
		String name2 = new String("한강");
		
		//물리적 메모리 주소 - hashCode()
		System.out.println(System.identityHashCode(name1));
		System.out.println(System.identityHashCode(name2));
		
		//논리적으로 동일
		System.out.println(name1.hashCode());
		System.out.println(name2.hashCode());
		
		//Book 객체 생성
		Book book1 = new Book(100, "채식주의자");
		Book book2 = new Book(100, "채식주의자");
		
		System.out.println(book1 == book2);
		System.out.println(book1.equals(book2));
		
		//논리적으로 동일하도록 재정의 함
		System.out.println(book1.hashCode());
		System.out.println(book2.hashCode());

	}

}

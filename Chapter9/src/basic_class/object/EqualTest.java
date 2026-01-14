package basic_class.object;

public class EqualTest {

	public static void main(String[] args) {
		
		//String 객체 생성
		String name1 = new String("한강");
		String name2 = new String("한강");
		
		System.out.println(name1 == name2); //메모리의 주소
		System.out.println(name1.equals(name2));  //논리적 동일
		
		//물리적 메모리 주소 - hashCode()
		System.out.println(System.identityHashCode(name1));
		System.out.println(System.identityHashCode(name2));
		
		//Book 객체 생성
		Book book1 = new Book(100, "채식주의자");
		Book book2 = new Book(100, "채식주의자");
		
		System.out.println(book1 == book2);  //false
		System.out.println(book1.equals(book2)); //true
	}

}

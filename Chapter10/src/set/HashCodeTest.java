package set;

public class HashCodeTest {
	public static void main(String[] args) {
		
		Employee emp1 = new Employee(101, "장그래");
		Employee emp2 = new Employee(101, "장그래");
		
		System.out.println(emp1);
		System.out.println(emp2);
		
		//물리적인 주소
		System.out.println(System.identityHashCode(emp1));
		System.out.println(System.identityHashCode(emp2));
		
		//물리적인 메모리 주소
		System.out.println(emp1 == emp2); //false
		
		//논리적으로 문자열을 동일하도록 재정의함
		System.out.println(emp1.equals(emp2)); //true
		
		//hashCode() 재정의
		System.out.println(emp1.hashCode());
		System.out.println(emp2.hashCode());
	}
}

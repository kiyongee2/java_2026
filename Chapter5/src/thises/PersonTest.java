package thises;

public class PersonTest {

	public static void main(String[] args) {
		
		Person noName = new Person();
		
		System.out.println(noName.name);
		System.out.println(noName.age);
		
		Person person = noName.returnItSelf();
		System.out.println(person);
		System.out.println(noName);
	}
}

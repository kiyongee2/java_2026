package classes;

public class PersonTest {

	public static void main(String[] args) {
		//p1 객체 생성
		Person p1 = new Person();
		p1.name = "이정후";
		p1.height = 185.1F;
		p1.weight = 76.7F;
		
		//p2 객체 생성
		Person p2 = new Person("김도영");
		p2.height = 183.2F;
		p2.weight = 80.5F;
		
		//p3 객체 생성
		Person p3 = new Person("최민정", 164.1F, 60.3F);
		
		//사람의 정보
		p1.showInfo();
		p2.showInfo();
		p3.showInfo();
	}
}

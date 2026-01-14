package classes;

public class Person {
	String name;
	float height;
	float weight;
	
	public Person(){};  //기본 생성자(생략 가능)
	
	public Person(String n) { //매개변수가 1개인 생성자
		name = n;
	}
	
	public Person(String n, float h, float w) {
		name = n;
		height = h;
		weight = w;
	}
	
	public void showInfo() {
		System.out.println("이름 : " + name + ", 키 : " + 
					height + ", 몸무게 : " + weight);
	}
}

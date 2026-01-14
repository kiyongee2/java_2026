package thises;

public class Person {
	String name;
	int age;
	
	//다른 생성자를 this로 호출
	Person(){
		this("이름 없음", 1);
	}
	
	//외부 입력을 this에 저장
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	Person returnItSelf() {
		return this;
	}	
}

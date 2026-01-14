package constructor;

public class Student {
	int studentId;       //학번
	String name;         //이름
	int grade;           //학년
	
	Student(){}   //기본 생성자(생략 가능)
	
	//매개 변수를 가진 생성자
	Student(int _studentId, String _name, int _grade){
		studentId = _studentId;
		name = _name;
		grade = _grade;
	}
	
	//학생 정보 메서드
	void displayInfo() {
		System.out.println("학번 : " + studentId);
		System.out.println("이름 : " + name);
		System.out.println("학년 : " + grade);
	}
}

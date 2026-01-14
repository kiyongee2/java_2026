package classes;

public class Student {
	int studentId;    //학번
	String name;      //이름
	int grade;        //학년
	
	//학생 정보 출력 메서드
	void displayInfo() {
		System.out.println("학번 : " + studentId);
		System.out.println("이름 : " + name);
		System.out.println("학년 : " + grade);
	}
}

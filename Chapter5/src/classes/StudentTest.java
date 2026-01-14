package classes;

public class StudentTest {
	public static void main(String[] args) {
		//Student 클래스의 인스턴스 생성
		Student s1 = new Student();
		
		//인스턴스 정보 출력
		System.out.println(s1);
		
		s1.studentId = 1001;
		s1.name = "정은하";
		s1.grade = 3;
		
		/*System.out.println("학번 : " + s1.studentId);
		System.out.println("이름 : " + s1.name);
		System.out.println("학년 : " + s1.grade);*/
		
		//학생 정보 출력 - 메서드 호출
		s1.displayInfo();
	}
}


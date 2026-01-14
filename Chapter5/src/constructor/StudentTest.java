package constructor;

public class StudentTest {

	public static void main(String[] args) {
		//Student 클래스의 인스턴스 s1 생성
		Student s1 = new Student();  //기본 생성자로 생성
		
		s1.studentId = 1001;
		s1.name = "정은하";
		s1.grade = 3;
		
		//매개값을 입력한 인스턴스 s2 .todtjd
		Student s2 = new Student(1002, "이우주", 1);
		
		//정보 출력
		s1.displayInfo();
		s2.displayInfo();
	}
}

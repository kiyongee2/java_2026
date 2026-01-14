package variable;

public class Variable {
	public static void main(String[] args) {

		String name;  //문자형 변수 선언
		int grade;    //정수형 변수 선언
		
		name = "이정우";
		grade = 1;
		
		//int class = 3;  //예약어 이므로 사용 불가
		int schoolClass = 5;
		
		//'+'는 변수와 문자를 연결하는 연산자
		System.out.println(name + "는 " + grade + 
						"학년 " + schoolClass + "반 입니다.");
		
		//변수 이름 작성시 오류
		//int 4grade;  //숫자로 시작 불가
		//int school Class;  //이름에 공백 불가
		//예약어 - if, for, class, break 등
	}
}

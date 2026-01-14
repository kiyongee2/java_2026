package score;

public class ScoreMain {

	public static void main(String[] args) {
		//학생 객체 생성
		Student lee = new Student(1001, "이정후");
		lee.setKoreanSubject("국어", 90);
		lee.setMathSubject("수학", 85);
		lee.showInfo();
		
		Student shin = new Student(1002, "신유빈");
		shin.setKoreanSubject("국어", 95);
		shin.setMathSubject("수학", 80);
		shin.showInfo();
	}
}

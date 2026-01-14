package score2;

public class ScoreMain {
	public static void main(String[] args) {
		
		Student lee = new Student(1001, "이정후");
		//과목 확장
		lee.addSubject("국어", 90);
		lee.addSubject("수학", 85);
		lee.addSubject("과학", 80);
		
		//정보 출력
		lee.displayInfo();
		
		Student shin = new Student(1002, "신유빈");

		shin.addSubject("국어", 92);
		shin.addSubject("수학", 80);
		shin.addSubject("과학", 79);
		
		shin.displayInfo();
	}
}

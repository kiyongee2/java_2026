package score;

public class Student {
	private int studentId;      //학번
	private String studentName; //이름
	private Subject korean;     //국어
	private Subject math;       //수학
	
	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
		korean = new Subject();
		math = new Subject();
	}
	
	//국어 점수 설정
	public void setKoreanSubject(String name, int score) {
		korean.setSubjectName(name);
		korean.setScorePoint(score);
	}
	
	//수학 점수 설정
	public void setMathSubject(String name, int score) {
		math.setSubjectName(name);
		math.setScorePoint(score);
	}
	
	//학생의 정보
	public void showInfo() {
		System.out.println(
				     "학번: " + studentId +
					 "\n이름: " + studentName + 
					 "\n국어 점수: " + korean.getScorePoint() +
					 "\n수학 점수: " + math.getScorePoint());
		System.out.println("------------------------");
	}
}

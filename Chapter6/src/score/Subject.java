package score;

public class Subject {
	private String subjectName;  //과목명
	private int scorePoint;      //점수
	
	//과목 설정
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	
	public String getSubjectName() {
		return subjectName;
	}
	
	//점수 설정
	public void setScorePoint(int scorePoint) {
		this.scorePoint = scorePoint;
	}
	
	public int getScorePoint() {
		return scorePoint;
	}
}

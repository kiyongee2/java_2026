package score2;

import score.Subject;

public class Student {
	private int studentId;      //학번
	private String studentName; //이름
	private Subject[] subjects; //
	
	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
		subjects = new Subject[10];
	}
	
	//과목 추가
	public void addSubject(String name, int score) {
		Subject subject = new Subject(); //과목 객체 1개 생성
		subject.setSubjectName(name);
		subject.setScorePoint(score);
		
		//생성된 과목 객체를 배열에 저장
		for(int i=0; i<subjects.length; i++) {
			if(subjects[i] == null) { //배열 공간이 비어있으면
				subjects[i] = subject; //배열에 저장
				break; //매번 빠져나옴
			}
		}
	}
	
	//학생의 정보와 평균 계산
	public void displayInfo() {
		int total = 0;  //총점
		double avg;     //평균
		int count = 0;  //개수
		
		System.out.println(   //학생 정보 출력
			     "학번: " + studentId +
				 "\n이름: " + studentName);
		for(int i=0; i<subjects.length; i++) {
			if(subjects[i] != null) { //배열의 공간이 비어있지 않으면
				total += subjects[i].getScorePoint(); //점수 더하기
				count++;  //배열에 저장된 객체의 개수
				
				System.out.println(   //과목 점수 출력
						 subjects[i].getSubjectName() + 
						 "점수: " + subjects[i].getScorePoint());
			}
		}
		//평균 계산
		avg = (double)total / count;
		System.out.printf("평균 점수: %.1f점", avg);
		System.out.println("\n========================");
	}
}


package arrays2;

public class CalcScore {

	public static void main(String[] args) {
		//학생 5명의 국어, 수학 점수
		int[][] score = {
				{91, 70},
				{80, 50},
				{76, 60},
				{90, 49},
				{80, 80},
		};
		int[] total = {0, 0};
		double[] avg = {0.0, 0.0};
		
		System.out.println(score.length);  //5
		
		for(int i=0; i<score.length; i++) {
			total[0] += score[i][0];  //국어, 열고정
			total[1] += score[i][1];  //수학
		}
		//평균 계산
		avg[0] = (double)total[0] / score.length;
		avg[1] = (double)total[1] / score.length;
		
		System.out.println("국어 합계: " + total[0]);
		System.out.println("수학 합계: " + total[1]);
		System.out.println("국어 평균: " + avg[0]);
		System.out.println("수학 평균: " + avg[1]);
	}

}

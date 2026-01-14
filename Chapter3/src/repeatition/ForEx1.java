package repeatition;

public class ForEx1 {

	public static void main(String[] args) {
		//1 ~ 10까지 더하기
		int sum = 0;
		int i;
		for(i=1; i<=10; i++){
			sum += i;
		}
		System.out.println("합계: " + sum + ", i = " + i);
		
		//1 ~ 10까지 곱하기
		int gob = 1;
		int x;
		for(x = 1; x <=10; x++) {
			gob *= x;
		}
		System.out.println("곱: " + gob + ", i = " + x);
	}

}

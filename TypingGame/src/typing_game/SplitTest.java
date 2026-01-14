package typing_game;

import java.util.Random;

public class SplitTest {

	public static void main(String[] args) {
		//문자열 자르기
		String str = "봄 여름 가을 겨울";
		String[] season = str.split(" ");  //배열 생성
		
		Random rnd = new Random();
		int rndIdx = rnd.nextInt(season.length);
		
		System.out.println(season[rndIdx]);
	}
}

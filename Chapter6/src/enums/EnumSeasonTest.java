package enums;

public class EnumSeasonTest {

	public static void main(String[] args) {
		// 열거형 타입 객체 생성
		Season season = null;
		//상수이므로 클래스 이름으로 직접 접근
		season = Season.여름;  
		
		System.out.println(season); //여름
		
		switch(season) {
		case 봄:
			season = Season.봄;
			break;
		case 여름:
			season = Season.여름;
			break;
		case 가을:
			season = Season.가을;
			break;
		case 겨울:
			season = Season.겨울;
			break;
		}
		
		System.out.println("현재 계절은 " + season + "입니다.");
		
		if(season == Season.여름) {
			System.out.println("무더위와 장마가 옵니다.");
		}else {
			System.out.println();
		}
	}
}

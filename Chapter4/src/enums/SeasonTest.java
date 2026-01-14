package enums;

public class SeasonTest {

	public static void main(String[] args) {
		Season season = null;
		season = Season.겨울;
		
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
		default:
			break;
		}
		
		System.out.println("현재 계절은 " + season + "입니다.");
		
		if(season == Season.여름) {
			System.out.println("피서 휴가를 떠납니다.");
		}else {
			System.out.println("피서 휴가는 가지 않습니다.");
		}
	}

}

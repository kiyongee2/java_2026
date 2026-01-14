package enums;

import java.util.Calendar;

//1, 2, 3... 순서로 나열됨
enum Week{
	SUNDAY,   
	MONDAY,
	TUESDAY,
	WEDNESDAY,
	THURSDAY,
	FRIDAY,
	SATURDAY
}

public class EnumWeekTest {

	public static void main(String[] args) {
		
		Week today = null;  //enum 객체 생성
		
		Calendar cal = Calendar.getInstance(); //Calendar 객체 생성
		//요일 가져옴(1-일, 2-월, 3-화, 4-수, 5-목, 6-금, 7-토)
		int week = cal.get(Calendar.DAY_OF_WEEK);
		System.out.println(week);
		
		switch(week) {
		case 1:
			today = Week.SUNDAY; break;
		case 2:
			today = Week.MONDAY; break;
		case 3:
			today = Week.TUESDAY; break;
		case 4:
			today = Week.WEDNESDAY; break;
		case 5:
			today = Week.THURSDAY; break;
		case 6:
			today = Week.FRIDAY; break;
		case 7:
			today = Week.SATURDAY; break;
		default:
			System.out.println("요일이 없습니다."); break;
		}
		System.out.println("Today is " + today);
		
		if(today == Week.SUNDAY) {
			System.out.println("일요일에는 놀러 나갑니다.");
		}else {
			System.out.println("평일에는 열심히 코딩합니다.");
		}
	}
}




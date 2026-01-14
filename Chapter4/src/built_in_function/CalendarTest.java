package built_in_function;

import java.util.Calendar;

public class CalendarTest {
	public static void main(String[] args) {
		//Calendar 객체 생성
		Calendar cal = Calendar.getInstance();
		
		System.out.println(cal); //cal 객체 출력
		System.out.println(cal.getTime()); //현재 날짜와 시간
		
		//날짜 - 년, 월, 일
		int year = cal.get(Calendar.YEAR);
		System.out.println(year);
		
		int month = cal.get(Calendar.MONTH) + 1;
		System.out.println(month);
		
		int date = cal.get(Calendar.DATE);
		System.out.println(date);
		
		//시간 - 시, 분, 초
		int hour = cal.get(Calendar.HOUR);
		System.out.println(hour);
		
		int minute = cal.get(Calendar.MINUTE);
		System.out.println(minute);
		
		int second = cal.get(Calendar.SECOND);
		System.out.println(second);
		
		//요일 - {1:일, 2:월, 3:화, 4:수, 5:목, 6:금, 7:토}
		int day = cal.get(Calendar.DAY_OF_WEEK);
		System.out.println(day);  
		
		String[] days = new String[] {"일", "월", "화", "수", "목", "금", "토"};
		System.out.println(days[day-1]);
		System.out.println("==============================");
		
		//시간 차이 계산
		Calendar theDay = Calendar.getInstance();
		Calendar today = Calendar.getInstance();
		
		theDay.set(2025, 6, 1);  //특정 날짜 설정
		today.set(2025, 6, 10);
		
		System.out.println(theDay.getTime());  //theDay 날짜 가져오기
		
		//시간 차이 계산
		//현재 시간 - 1970, 1. 1일 자정 이후부터 현재까지 밀리초(ms)로 측정
		System.out.println(cal.getTimeInMillis());
		System.out.println(cal.getTimeInMillis()/(24*60*60*1000)); //일
		System.out.println(cal.getTimeInMillis()/(24*60*60*1000)/365); //년
		
		long passedTime = today.getTimeInMillis() - theDay.getTimeInMillis();
		System.out.println(passedTime);
		
		//ms초를 일로 환산
		passedTime = passedTime / (24*60*60*1000);
		System.out.println(passedTime + "일이 지났습니다.");
	}
}






package built_in_function;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {

	public static void main(String[] args) {
		// 날짜, 시간 클래스
		Date today = new Date();
		System.out.println(today);
		
		SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(date.format(today));
		
//		SimpleDateFormat time = new SimpleDateFormat("hh:mm:ss a"); //12시각제
		SimpleDateFormat time = new SimpleDateFormat("HH:mm:ss"); //24시각제
		System.out.println(time.format(today));
	}
}

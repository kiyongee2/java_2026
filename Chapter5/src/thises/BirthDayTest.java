package thises;

public class BirthDayTest {

	public static void main(String[] args) {
		//bDay 객체 생성
		BirthDay bDay = new BirthDay();
		
		/*
		 * bDay가 가리키는 인스턴스와 setYear()의 this가 가리키는
		 * 인스턴스가 같은 곳에 있음
		 */
		bDay.setYear(2020); //연도 입력
		System.out.println(bDay);
		
		bDay.printThis();  //함수 호출
	}
}

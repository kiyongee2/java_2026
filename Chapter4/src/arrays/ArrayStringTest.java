package arrays;

public class ArrayStringTest {

	public static void main(String[] args) {
		// 변수
		/*String car1 = "소나타";
		String car2 = "EV3";
		String car3 = "BMW";
		
		System.out.println(car1);
		System.out.println(car2);
		System.out.println(car3);*/
		
		//1. 문자열 배열의 선언과 초기화
		String[] cars = {"소나타", "EV3", "BMW"};
		
		//특정 요소 검색
		System.out.println(cars[0]);
		
		//배열의 길이
		System.out.println("배열의 길이: " + cars.length);
		
		//전체 조회(검색)
		for(int i=0; i<cars.length; i++) {
			System.out.println(cars[i]);
		}
		
		System.out.println("=========================");
		
		//2. 문자열 배열 선언
		String[] carList = new String[3];
		
		//전체 출력
		for(int i=0; i<carList.length; i++) {
			System.out.println(carList[i]);
		}
		
		//요소 저장
		carList[0] = "소나타";
		carList[1] = "EV3";
		carList[2] = "BMW";
		
		//특정 요소 검색
		System.out.println(carList[2]);
		
		//특정 요소 수정
		carList[1] = "Ionic6";
		
		//전체 출력
		for(int i=0; i<cars.length; i++) {
			System.out.println(carList[i]);
		}
		
		//향상 for
		for(String car : carList) {
			System.out.println(car);
		}
	}
}

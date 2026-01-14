package polymorphism.fruit;

import java.util.Scanner;

public class FruitTest {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("1.포도 | 2.복숭아 | 3.바나나");
		System.out.print("선택> ");
		
		int menu = scanner.nextInt(); //메뉴 선택
		
		Fruit fruit = null;  //부모 타입 객체 선언
		if(menu == 1) {
			fruit = new Grape(); //자식 타입 객체 생성
		}else if(menu == 2) {
			fruit = new Peach();
		}else if(menu == 3) {
			fruit = new Banana();
		}
		fruit.showInfo();  //메서드 - 동적 바인딩
		
		scanner.close();
	}
}

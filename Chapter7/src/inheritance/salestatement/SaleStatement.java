package inheritance.salestatement;

public class SaleStatement {

	public static void main(String[] args) {
		
		Drink coffee = new Drink("커피", 2500, 4);
		Drink tea = new Drink("녹차", 3500, 3);
		Alcohol soju = new Alcohol("소주", 4000, 2, 15.2f);
		Alcohol beer = new Alcohol("맥주", 3000, 3, 5.5f);
		
		Drink.printTitle();  //클래스 이름으로 직접 접근
		coffee.printData();
		tea.printData();
		System.out.println();
		
		Alcohol.printTitle();
		soju.printData();
		beer.printData();
		
		//총금액 계산하기
		int total = 0;
		total = coffee.calcPrice() + tea.calcPrice() + soju.calcPrice();
		System.out.println("***** 합계 금액 : " + total + "원 *****");
	}
}

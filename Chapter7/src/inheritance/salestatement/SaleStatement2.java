package inheritance.salestatement;

public class SaleStatement2 {

	public static void main(String[] args) {
		//배열에 인스턴스 저장
		Drink[] drinks = {
		    new Drink("커피", 2500, 4),
		    new Drink("녹차", 3500, 3),
		    new Alcohol("소주", 4000, 2, 15.2f),
		    new Alcohol("맥주", 3000, 3, 5.5f)
		};
		
		// 일반 음료 출력
        Drink.printTitle();
        for (Drink drink : drinks) {
        	//drink가 Alcohol의 인스턴스가 아니라면
            if (!(drink instanceof Alcohol)) {
                drink.printData();
            }
        }
        System.out.println();

        // 알코올 음료 출력
        Alcohol.printTitle();
        for (Drink drink : drinks) {
        	//drink가 Alcohol의 인스턴스라면
            if (drink instanceof Alcohol) {
                drink.printData();
            }
        }

		int total = 0;
		for(Drink drink : drinks)
			total += drink.calcPrice();
		
		System.out.println("***** 합계 금액 : " + total + "원 *****");
	}
}

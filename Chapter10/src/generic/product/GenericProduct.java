package generic.product;

public class GenericProduct {

	public static void main(String[] args) {
		
		//<클래스, 문자열>
		Product<TV, String> prod1 = new Product<>();
		TV tv = new TV();
		
		prod1.setKind(tv);
		prod1.setModel("SmartTV");
		System.out.println("모델: " + prod1.getModel());
		System.out.println(tv.making());
		
		//<클래스, 문자열>
		Product<Car, String> prod2 = new Product<>();
		Car car = new Car();
		
		prod2.setKind(car);
		prod2.setModel("전기차");
		System.out.println("모델: " + prod2.getModel());
		System.out.println(car.making());
		
	}
}

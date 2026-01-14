package generic.box;

public class BoxTest {
	public static void main(String[] args) {
		//String 형 - 기본 자료형
		Box<String> box1 = new Box<>();
		box1.set("행운을 빌어요");
		String msg = box1.get();
		System.out.println(msg);
		
		//Integer 형
		Box<Integer> box2 = new Box<>();
		box2.set(10);
		Integer num = box2.get();
		System.out.println(num);
		
		//Car 타입 - 사용자 정의 자료형
		Box<Car> box3 = new Box<>();
		box3.set(new Car("아이오닉6"));
		Car car = box3.get();
		System.out.println(car);
	}
}

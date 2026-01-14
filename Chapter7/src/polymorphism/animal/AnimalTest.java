package polymorphism.animal;

class Animal{
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}

class Human extends Animal{
	public void move() {
		System.out.println("사람이 두 발로 걷습니다.");
	}
}

class Horse extends Animal{
	public void move() {
		System.out.println("말이 네 발로 뜁니다.");
	}
}

class Eagle extends Animal{
	public void move() {
		System.out.println("독수리가 날개를 쭉 펴고 날아갑니다.");
	}
}

public class AnimalTest {
	public static void main(String[] args) {
		//다형성 -> 부모 타입 = 자식 타입 
		/*Animal human = new Human();
		Animal horse = new Horse();
		
		human.move(); //메서드 - 동적 바인딩
		horse.move(); */
		
		//배열로 관리
		/*Animal[] animals = {
			new Human(), 
			new Horse(),
			new Eagle()
		}; 
		
		for(Animal animal : animals)
			animal.move();*/
		
		//다형성 -> 매개 변수의 다형성
		moveAnimal(new Human());
		moveAnimal(new Horse());
		moveAnimal(new Eagle());
	}
	
	//moveAnimal 메서드 정의
	public static void moveAnimal(Animal animal) {
		animal.move();
	}
}

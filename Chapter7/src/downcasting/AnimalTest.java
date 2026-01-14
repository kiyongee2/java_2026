package downcasting;

class Animal{
	
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}

//Animal을 상속받은 Human 클래스 정의
class Human extends Animal{
	
	@Override
	public void move() {
		System.out.println("사람이 두 발로 걷습니다.");
	}
	
	public void readBook() {
		System.out.println("사람이 책을 읽습니다.");
	}
}

class Horse extends Animal{
	
	@Override
	public void move() {
		System.out.println("말이 네 발로 뜁니다.");
	}
	
	public void run() {
		System.out.println("말이 사람을 태우고 빠르게 달립니다.");
	}
}

class Eagle extends Animal{
	
	@Override
	public void move() {
		System.out.println("독수리가 하늘을 납니다.");
	}
	public void hunting() {
		System.out.println("독수리가 물고기를 사냥합니다.");
	}
}

public class AnimalTest {
	
	static Animal[] animals = new Animal[3]; //객체를 저장할 배열 생성

	public static void main(String[] args) {
		//객체를 생성하여 저장(다형성)
		animals[0] = new Human(); 
		animals[1] = new Horse();
		animals[2] = new Eagle();
		
		//부모 타입으로 객체를 생성하므로 자식 객체의 메서드에 접근할 수 없음
		animals[0].move();
		animals[1].move();
		animals[2].move();
		//readBook()에 접근할 수 없음
		
		Animal animal = animals[0]; //new Human();
		
		if(animal instanceof Human) { //animal이 Human의 객체라면
			Human human = (Human)animal; //Human 타입으로 다운 캐스팅
			human.readBook();
		}
		
		System.out.println("===== 원래 형으로 다운캐스팅 =====");
		downCasting(); //downCasting() 호출
		
	} //main 닫기
	
	//다운 캐스팅 메서드로 정의
	public static void downCasting() {
		//하위 클래스로 형변환 - instanceof 키워드 사용
		for(int i = 0; i < animals.length; i++) {
			Animal animal = animals[i];
			if(animal instanceof Human) {
				Human human = (Human)animal;
				human.readBook();
			}else if(animal instanceof Horse) {
				Horse horse = (Horse)animal;
				horse.run();
			}else if(animal instanceof Eagle) {
				Eagle eagle = (Eagle)animal;
				eagle.hunting();
			}else {
				System.out.println("지원하지 않는 타입입니다.");
			}
		}
	}
}

package abstract_class.animal;

public class AnimalTest {

	public static void main(String[] args) {
		/*Cat cat = new Cat();
		cat.breathe();
		cat.cry();
		
		Dog dog = new Dog();
		dog.breathe();
		dog.cry();
		
		//메서드의 다형성
		animalCry(new Cat());
		animalCry(new Dog());*/
		
		Animal cat = new Cat();
		cat.breathe();
//		cat.cry();
		
		Animal dog = new Dog();
		dog.breathe();
//		dog.cry();
		
		animalCry(cat);
		animalCry(dog);
		
	}
	
	//동물의 울음소리 메서드 정의
	public static void animalCry(Animal animal) {
		animal.cry();
	}
}

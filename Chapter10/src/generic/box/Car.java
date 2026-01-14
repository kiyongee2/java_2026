package generic.box;

public class Car {
	
	String name;
	
	public Car(String name){
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}
}

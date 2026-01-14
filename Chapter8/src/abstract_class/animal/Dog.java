package abstract_class.animal;

public class Dog extends Animal{
	
	public Dog() {
		this.kind = "포유류";
	}

	@Override
	public void cry() {
		System.out.println("멍멍!");
	}
}

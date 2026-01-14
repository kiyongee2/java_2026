package abstract_class.phone;

public abstract class Phone {
	public String owner;
	
	public Phone(String owner) {
		this.owner = owner;
	}
	
	public void powerOn() {
		System.out.println("폰 전원을 켭니다.");
	}
	
	public void powerOff() {
		System.out.println("폰 전원을 끕니다.");
	}
}

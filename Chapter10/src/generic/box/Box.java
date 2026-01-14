package generic.box;

public class Box<T> {
	//T는 자료형, type은 멤버 변수
	private T type;  
	
	public void set(T type) {
		this.type = type;
	}
	
	public T get() {
		return type;
	}
}


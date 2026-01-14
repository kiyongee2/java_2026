package singleton;

public class Company {
	private static Company instance; //instance 객체 선언
	
	private Company() {}; //외부에서 생성자를 호출 불가
	
	public static Company getInstance() { //Company로 직접 접근 가능
		if(instance == null) {
			instance = new Company();
		}
		return instance;
	}
}



package methods;

public class ScopeStaticVar {
	
	static int x = 0;  //정적 변수
	
	public static int oneUp() {
		x++;
		return x;
	}

	public static void main(String[] args) {
		
		System.out.println(oneUp());
		System.out.println(oneUp());
		System.out.println(oneUp());
		
		//x의 값
		System.out.println("x = " + x);
	}
}

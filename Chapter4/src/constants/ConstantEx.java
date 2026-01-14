package constants;

public class ConstantEx {

	public static void main(String[] args) {
		// 외부 클래스의 상수 사용
		// 정적 변수일 경우 클래스 이름으로 직접 접근
		int maxVal = UsingDefine.MAX_NUM;
		int minVal = UsingDefine.MIN_NUM;
		
		System.out.println(maxVal);
		System.out.println(minVal);
	}
}

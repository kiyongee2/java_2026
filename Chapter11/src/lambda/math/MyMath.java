package lambda.math;

@FunctionalInterface
public interface MyMath {
	//1개의 추상메서드만 사용 가능
	public int myAbs(int n);
	
	//public int mySquare(int n); //오류
}

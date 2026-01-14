package chapter4;

public class MyAbs {
	
	public static int myAbs(int x) {
		if(x < 0)
			return -x;
		else
			return x;
	}

	public static void main(String[] args) {
		//절대값 계산
		int val1 = myAbs(-4);
		int val2 = myAbs(4);
		
		System.out.println("myAbs(-4) = " + val1);
		System.out.println("myAbs(4) = " + val2);
	}

}

package interface_impl;

public class MyMathImpl implements MyMath{

	@Override
	public int myAbs(int n) {
		int value = (n < 0 ? -n : n); //절대값 연산
		return value;
	}

}

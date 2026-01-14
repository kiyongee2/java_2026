package datatype;

public class NumberType {
	public static void main(String[] args) {
		System.out.println("***** 정수 자료형 *****");
		byte bData1 = 127; //byte(1byte) : -128 ~ 127
		//byte bData2 = 128;  //범위를 벗어나 오류
		
		System.out.println(bData1);
		
		int iNum = 220000000;   //int(4byte) : -21억 ~ 21억 
		long lNum = 3000000000L;  //long(8byte)
		 
		System.out.println(iNum);
		System.out.println(lNum);
		
		System.out.println("***** 실수 자료형 *****");
		//float(4byte), double(8byte) - 정밀도 차이
		float fNum = 1.23456789F;  //소수 7자리까지 표현
		double dNum = 1.23456789012345678; //소수 16자리까지 표현
		
		System.out.println(fNum);
		System.out.println(dNum);
	}
}

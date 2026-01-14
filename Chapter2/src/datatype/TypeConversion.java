package datatype;

public class TypeConversion {

	public static void main(String[] args) {
		//자료형의 크기 확인
		System.out.printf("byte형의 크기   ==> %dbit\n", Byte.SIZE);
		System.out.printf("short형의 크기  ==> %dbit\n", Short.SIZE);
		System.out.printf("int형의 크기    ==> %dbit\n", Integer.SIZE);
		System.out.printf("long형의 크기   ==> %dbit\n", Long.SIZE);
		System.out.printf("float형의 크기  ==> %dbit\n", Float.SIZE);
		System.out.printf("double형의 크기 ==> %dbit\n", Double.SIZE);
		System.out.printf("char형의 크기   ==> %dbit\n", Character.SIZE);
		
		//묵시적 형변환(자동 형변환)
		int iNum = 20;
		float fNum = iNum;
		
		System.out.println(iNum); //20
		System.out.println(fNum); //20.0
		
		double dNum;
		dNum = iNum + fNum;
		
		System.out.println(dNum); //40.0
		
		//명시적 형변환(강제 형변환)
		double dNum2 = 1.5;
		float fNum2 = 0.7F;
		
		int iNum2 = (int)dNum2; //실수형 -> 정수형
		int iNum3 = (int)fNum2;
		int iNum4 = (int)(dNum2 + fNum2);
		
		System.out.println(iNum2); //1
		System.out.println(iNum3); //0
		System.out.println(iNum4); //2
	}
}

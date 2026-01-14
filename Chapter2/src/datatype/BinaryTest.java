package datatype;

public class BinaryTest {
	public static void main(String[] args) {
		// 진수 표기법
		int num = 10;      //10진수
		int bNum = 0b1010; //2진수
		int hNum = 0xA;    //16진수
		
		System.out.println(num);
		System.out.println(bNum);
		System.out.println(hNum);
		
		//2진수를 음의 정수로 만드는 방법 
		//2의 보수법 - 1의 보수를 구한후 1을 더함
		int num1, num2;
		num1 = 0b00000000000000000000000000000101;  //5
		num2 = 0b11111111111111111111111111111010;  //-6(1의 보수)
		//num2 = 0b11111111111111111111111111111011;  //1을 더함 -6(+1)=-5
		
		System.out.println(num1);
		System.out.println(num2);
	}
}

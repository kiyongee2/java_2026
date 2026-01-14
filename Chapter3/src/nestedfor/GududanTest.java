package nestedfor;

public class GududanTest {

	public static void main(String[] args) {
		// 구구단 전체
		for(int dan = 2; dan < 10; dan++) {
			System.out.println(" [" + dan + " 단]");
			for(int i = 1; i < 10; i++) {
				System.out.println(dan + " x " + i + " = " + (dan * i));
			}
			System.out.println();
		}
		
		// 단보다 곱하는 수가 작거나 같도록 출력하기
		for(int dan = 2; dan < 10; dan++) {
			System.out.println(" [" + dan + " 단]");
			for(int i = 1; i <= dan; i++) {
				System.out.println(dan + " x " + i + " = " + (dan * i));
			}
			System.out.println();
		}
		
		// 단보다 곱하는 수가 작거나 같도록 출력하기
		for(int dan = 2; dan < 10; dan++) {
			System.out.println(" [" + dan + " 단]");
			for(int i = 1; i < 10; i++) {
				if(i > dan)
					break;
				System.out.println(dan + " x " + i + " = " + (dan * i));
			}
			System.out.println();
		}
		
		// 구구단 전체
		for(int dan = 2; dan < 10; dan++) {
			System.out.println(" [" + dan + " 단]");
			for(int i = 1; i < 10; i++) {
				System.out.println(dan + " x " + i + " = " + (dan * i));
			}
			System.out.println();
		}
	}

}

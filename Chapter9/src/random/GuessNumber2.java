package random;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber2 {

	public static void main(String[] args) {
		
		Random rand = new Random();
		int comNum = rand.nextInt(30) + 1; //1 ~ 30
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			try {
				System.out.print("숫자(예: 1~30)를 입력: ");
				int guessNum = Integer.parseInt(sc.nextLine());
				
				if(guessNum < 1 || guessNum > 30) {
					System.out.println("범위를 초과했어요. 다시 입력하세요");
				}else {
					if(guessNum == comNum) {
						System.out.println("정답!");
						break;
					}else if(guessNum > comNum) {
						System.out.println("너무 커요!");
					}else {
						System.out.println("너무 작아요!");
					}
				}
			}catch(NumberFormatException e) {
				System.out.println("유효한 숫자를 입력하세요");
			}
		}
		sc.close();
 	}
}


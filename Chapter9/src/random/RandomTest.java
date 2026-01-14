package random;

import java.util.Random;

public class RandomTest {

	public static void main(String[] args) {
		//난수 생성 - Math.random()
		int n1 = (int)(Math.random() * 2); //0 ~ 1
		System.out.println(n1);
		
		//난수 생성 - Random() 클래스 활용
		Random rnd = new Random();
		//rnd.setSeed(0);  //시드 설정 - 동일한 결과 반복
		
		//시스템 시간을 기반으로 자동 변화
		System.out.println(rnd.nextInt()); 
		int n2 = rnd.nextInt(2);
		System.out.println(n2); //0 ~ 1
		
		//동전 던지기
		int coin = rnd.nextInt(2) + 1;
		if(coin == 1) 
			System.out.println("앞면");
		else
			System.out.println("뒷면");
		
		//주사위 10번 던지기
		/*for(int i=1; i<=10; i++) {
			int dice = rnd.nextInt(6) + 1;
			System.out.println(dice);
		}*/
		
		
	}
}

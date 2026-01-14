package built_in_function;

public class MathTest {

	public static void main(String[] args) {
		//절대값
		int v1 = Math.abs(-4);
		System.out.println(v1); //4
		
		//정수로 반올림
		long v2 = Math.round(5.6);  
		System.out.println(v2); //6
		
		//내림(버림)
		double v3 = Math.floor(5.9);
		System.out.println(v3); //5.0
		
		//최대값
		int max = Math.max(10, 20);
		System.out.println(max); //20
		
		//최소값
		int min = Math.min(10, 20);
		System.out.println(min); //10
		
		//무작위수  0.0 <= rand < 1.0;
		double rand = Math.random();
		System.out.println(rand);
		
		//동전 추출 - 앞, 뒤
		int coin = (int)(Math.random() * 2);
		System.out.println(coin);
		
		if(coin == 0)
			System.out.println("앞면");
		else
			System.out.println("뒤면");
		
		//주사위 눈 : 1 ~ 6
		int dice = (int)(Math.random() * 6) + 1;
		System.out.println(dice);
		System.out.println("==================");
		
		//주사위 10번 던지기
		for(int i=1; i<=10; i++) {
			dice = (int)(Math.random() * 6) + 1;
			System.out.println(dice);
		}
		
		String[] word = {"나", "너", "우리", "세계", "우주"};
		int rnd = (int) (Math.random() * word.length);
		System.out.println(rnd);
		System.out.println(word[rnd]);
		
	}

}

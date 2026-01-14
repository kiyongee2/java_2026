package built_in_function;

public class LottoTest {

	public static void main(String[] args) {
		// 로또 복권 추첨
		int[] lotto = new int[6];
		
		//Math.random() 사용
		lotto[0] = (int)(Math.random() * 45) + 1;
//		System.out.println(lotto[0]);
		
		//6개의 번호 출력 - 중복 발생!!
//		for(int i=0; i<lotto.length; i++) {
//			lotto[i] = (int)(Math.random() * 45) + 1;
//			System.out.print(lotto[i] + " ");
//		}
//		System.out.println();
		
		//중복 번호 제거
		for(int i = 0; i < lotto.length; i++) {
			lotto[i] = (int)(Math.random() * 45) + 1;
			for(int j = 0; j < i; j++) {
				if(lotto[i] == lotto[j])
					i--;
			}
		}
		
		//로또 당첨 번호 출력
		for(int i=0; i<lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}
	}

}



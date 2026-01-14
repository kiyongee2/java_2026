package choice;

public class IfElse2 {

	public static void main(String[] args) {
		
		int n1 = 10;
		int n2 = 20;
		int max;
		
		//max = (n1 > n2) ? n1 : n2;
		
		if(n1 > n2) {
			max = n1;
		}else {
			max = n2;
		}
		
		System.out.println("두 수중 큰 수는 " + max + "입니다.");
	}

}

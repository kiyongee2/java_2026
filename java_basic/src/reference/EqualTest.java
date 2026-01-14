package reference;

public class EqualTest {
	
	public static void check(int[] x, int[] y) {
		if(x==y) System.out.println("O");
		else System.out.println("N");
	}

	public static void main(String[] args) {
		//stack -> heap (참조 영역)
		int[] a = new int[] {1, 2, 3, 4}; 
		int[] b = new int[] {1, 2, 3, 4};
		int[] c = new int[] {1, 2, 3};
		check(a, b);
		check(b, c);
		check(c, a);
		
	}

}

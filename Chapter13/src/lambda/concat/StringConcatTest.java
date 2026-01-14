package lambda.concat;

public class StringConcatTest {

	public static void main(String[] args) {
		String str1 = "Hill";
		String str2 = "State";
		
		StringConcat concat;
		concat = (s, v) -> System.out.println(s + ", " + v);
		concat.makeString(str1, str2);
	}
}

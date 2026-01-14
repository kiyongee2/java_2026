package arrays;

public class ArrayCharTest {

	public static void main(String[] args) {
		// 알파벳 대문자 저장하고 출력
		char ch = 'A';
		char[] alphabets = new char[26];
		
//		ch = (char) (ch + 1);
//		ch++;
//		System.out.println(ch); //'B'
		
		//배열에 알파벳 저장
		for(int i=0; i<alphabets.length; i++) {
			alphabets[i] = ch;
			ch++;
		}
		
		//출력
		for(int i=0; i<alphabets.length; i++) {
			System.out.println(alphabets[i] + ", " + (int)alphabets[i]);
		}
	}
}

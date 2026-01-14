package exceptions;

public class MultiException {

	public static void main(String[] args) {
		
		String[] array = {"100", "123a"};
		
		for(int i = 0; i <= array.length; i++) {
			
			//System.out.println(array[i]); //배열 출력
			//문자열을 정수로 변환
			int value = Integer.parseInt(array[i]);  
			System.out.println(value);
			
		}
	}
}

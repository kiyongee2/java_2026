package basic_class.string;

public class StringMethod2 {

	public static void main(String[] args) {
		//replace(변경전 문자, 변경후 문자)
		// 문자 대체
        String str1 = "Hello Java!";
        String result1 = str1.replace('a', '@');
        System.out.println(result1);  // Hello J@v@!

        // 문자열 대체
        String str2 = "한국의 수도는 서울이다.";
        String result2 = str2.replace("한국", "대한민국");
        System.out.println(result2);  // 대한민국의 수도는 서울이다.

        // 특수 문자 제거
        String phone = "010-1234-5678";
        String result3 = phone.replace("-", "");
        System.out.println(result3);  // 01012345678
        
        /*
           split(구분기호) - 구분 기호로 구분하여 배열로 반환함
         */
  		String carts = "potato strawberry garlic";
  		String[] array = carts.split(" ");
  		
  		System.out.println(array[0]); //potato
  		System.out.println(array[1]); //strawberry
  		
  		for(int i = 0; i < array.length; i++){
  			System.out.print(array[i]+ " ");
  		}
  		System.out.println();
  		/*
  		    실습) 문자열을 분리한 후 출력하기
  		 	  123  
  		 	  456
  		 	  789 
  		 */
  		String str = "1,2,3,4,5,6,7,8,9";
  		String[] array2 = str.split(",");
  		
  		//System.out.println(array2[0]); //1
  		
  		for(int i = 0; i < array2.length; i++) {
  			System.out.print(array2[i]);
  		}
  		
  		//문자열 분리 출력
  		for(int i = 0; i < array2.length; i++) {
  			System.out.print(array2[i]);
  			if((i + 1) % 3 == 0)
  				System.out.println(); //3개 마다 줄바꿈
  		}
      	
		
		/*
		  * toUpperCase() - 대문자로 변환
		  * toLowerCase() - 소문자로 변환
		  * equals(str2) - 대소문자 구분하여 일치 여부
		  * equalsIgnoreCase(str2) - 대소문자 구분없이 일치 여부
		*/
		String s1 = "Hello World!";
		String s2 = "HELLO WORLD!";
		
		if(s1.equals(s2))
			System.out.print(s1.toUpperCase()); 
		else if(s1.equalsIgnoreCase(s2))
			System.out.println(s1.toLowerCase()); //hello world!
		else
			System.out.println(s2);  
		
	}
}







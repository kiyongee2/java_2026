package arraylist;

import java.util.ArrayList;

public class ArrayCart {

	public static void main(String[] args) {
		// ArrayList 객체 생성
		ArrayList<String> carts = new ArrayList<>();
		
		//요소 저장
		carts.add("커피");
		carts.add("계란");
		carts.add("생수");
		carts.add("커피");
		
		System.out.println(carts.size());
		
		//요소 수정
		carts.set(0, "라면");
		
		//요소 삭제
		carts.remove(3);
		
		for(int i=0; i<carts.size(); i++) {
			String cart = carts.get(i);
			System.out.println(cart);
		}
		System.out.println("=============");
		
		//향상 for문
		for(String cart : carts)
			System.out.println(cart);

	}

}

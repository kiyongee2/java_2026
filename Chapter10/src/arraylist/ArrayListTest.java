package arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
	public static void main(String[] args) {
		//List 타입으로 vegeList(ArrayList) 객체 생성
		List<String> vegeList = new ArrayList<>();
		
		//요소 추가
		vegeList.add("양파");
		vegeList.add("마늘");
		vegeList.add("감자");
		
		//객체 출력
		System.out.println(vegeList);
		
		//객체의 개수
		System.out.printf("총 객체수: %d개\n", vegeList.size());
		
		//특정 요소 검색(인덱싱)
		System.out.println(vegeList.get(0));
		
		//특정 위치에 요소 추가 - 1번 위치에 "고추" 추가
		vegeList.add(2, "고추");
		
	    //전체 객체 요소 출력
		for(int i = 0; i < vegeList.size(); i++) {
			String vegetable = vegeList.get(i);
			System.out.print(vegetable + " ");
		}
		System.out.println();
		
		//객체 요소 수정 - "감자"를 "고구마"로 변경
		vegeList.set(3, "고구마");
		System.out.println(vegeList);
		
		//요소 삭제 - "마늘" 삭제
		//vegeList.remove(1);
		vegeList.remove("마늘");
		
		//향상 for문
		for(String vegetable : vegeList)
			System.out.print(vegetable + " ");
	}
}

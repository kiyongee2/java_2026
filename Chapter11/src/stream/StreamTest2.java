package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest2 {

	public static void main(String[] args) {
		//리스트로 부터 스트림 얻기
		/*List<String> companyList = new ArrayList<>();
		companyList.add("LG");
		companyList.add("현대");
		companyList.add("삼성");*/
		
		List<String> companyList = Arrays.asList("LG", "현대", "삼성");
		
		for(String company : companyList)
			System.out.println(company);
		
		//Stream 클래스
		Stream<String> stream = companyList.stream();
		stream.forEach(company -> System.out.println(company));
	}
}

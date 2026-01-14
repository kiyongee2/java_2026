package stream.score;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StudentStreamTest {

	public static void main(String[] args) {
		//데이터 저장
		List<Student> list = Arrays.asList(
			new Student("콩쥐", 90),	
			new Student("팥쥐", 70),	
			new Student("심청", 80)
		);
		
		//스트림 얻어 출력하기
		Stream<Student> stream = list.stream();
		stream.forEach(std -> {
			String name = std.getName();
			int score = std.getScore();
			System.out.println(name + " : " + score);
		});
		
		//스트림 연산
		//stream()은 한 번 사용하면 소모되므로 다시 값을 할당함
		System.out.println("=== 학생의 이름(매핑) 출력 ===");
		stream = list.stream();
		stream.map(std -> std.getName())
			  .forEach(s -> System.out.println(s));
		
		System.out.println("=== 학생의 점수(매핑) 출력 ===");
		stream = list.stream();
		stream.mapToInt(std -> std.getScore())
			  .forEach(s -> System.out.println(s));
		
		System.out.println("=== 점수가 90 이상인 학생 이름(필터링) ===");
		list.stream().filter(std -> std.getScore() >= 90)
					 .map(std -> std.getName())
					 .forEach(s -> System.out.println(s));
					 
	}
}










package stream.student;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StudentStreamTest {

	public static void main(String[] args) {
		
		List<Student> list = Arrays.asList(
			new Student("콩쥐", 90),
			new Student("팥쥐", 70),
			new Student("심청", 80)
		);
		 
		//전체 요소 출력(반복자) - 람다식 표기
		Stream<Student> stream = list.stream();
		stream.forEach(std -> { //for문 기능
			//System.out.println(std.getName() + " : " + std.getScore());
			String name = std.getName();
			int score = std.getScore();
			System.out.println(name + " : " + score);
		});
		
		//이름만 출력
		stream = list.stream();
		stream.map(std->std.getName())
			  .forEach(s-> System.out.println(s));
		System.out.println();
		
		//점수만 출력
		stream = list.stream();
		stream.mapToInt(std->std.getScore())
		      .forEach(s-> System.out.println(s));
		
		//점수가 90점 이상인 학생 이름
		list.stream().filter(std->std.getScore() >= 90)
		             .map(std -> std.getName())
		             .forEach(s -> System.out.println(s));
		
	}

}


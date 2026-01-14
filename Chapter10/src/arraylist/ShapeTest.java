package arraylist;

import java.util.ArrayList;

class Shape{
	public void draw() {
		System.out.println("도형");
	}
}

class Circle extends Shape{
	public void draw() {
		System.out.println("원");
	}
}

class Triangle extends Shape{
	public void draw() {
		System.out.println("삼각형");
	}
}

public class ShapeTest {
	public static void main(String[] args) {
		ArrayList<Shape> list = new ArrayList<>();
		
		list.add(new Shape());
		list.add(new Circle());
		list.add(new Triangle());
		
		for(Shape s : list)
			s.draw();
	}
}








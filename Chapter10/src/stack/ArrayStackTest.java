package stack;

import java.util.ArrayList;

class MyStack{
	
	private ArrayList<String> arrayStack;
	
	public MyStack() {
		arrayStack = new ArrayList<>();
	}
	
	//넣기
	public void push(String data) {
		arrayStack.add(data);
	}
	
	//꺼내기
	public String pop() {
		int len = arrayStack.size();
		if(len == 0) {
			System.out.println("스택이 비었습니다.");
			return null;
		}
		return arrayStack.remove(len - 1);
	}
}

public class ArrayStackTest {

	public static void main(String[] args) {
		
		MyStack stack = new MyStack();
		
		//요소 넣기
		stack.push("돼지");
		stack.push("닭");
		
		//요소 꺼내기
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());

	}

}

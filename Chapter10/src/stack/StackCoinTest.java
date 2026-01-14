package stack;

import java.util.Stack;

class Coin{
	private int value;
	
	public Coin(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
}


public class StackCoinTest {

	public static void main(String[] args) {
		
		Stack<Coin> coinBox = new Stack<>();
		
		//동전 객체 생성
		Coin coin500 = new Coin(500);
		Coin coin100 = new Coin(100);
		Coin coin50 = new Coin(50);
		Coin coin10 = new Coin(10);
		
		//넣기(500 - 100 - 50 - 10)
		coinBox.push(coin500);
		coinBox.push(coin100);
		coinBox.push(coin50);
		coinBox.push(coin10);
		
		//빼기(10 - 50 - 100 - 500)
		System.out.println(coinBox.pop().getValue() + "원");
		System.out.println(coinBox.pop().getValue() + "원");
		
		//빼기 범위를 초과하면 EmptyStackException 발생
//		while(!coinBox.isEmpty()) {
//			Coin coin = coinBox.pop(); //삭제
//			System.out.println(coin.getValue() + "원");
//		}
		
	}

}











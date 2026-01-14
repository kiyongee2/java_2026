package chapter2;

public class ShareRemainder {

	public static void main(String[] args) {
		/*
		   빵 25개를 4명이 나눠 가질 경우 각자의 몫과
		   남은 빵의 개수 구하기
	    */
		int share, remainder;
		
		int bread = 25;
		int person = 4;
		
		share = bread / person;
		remainder = bread % person;
		 
		System.out.println("각자의 몫: " + share);
		System.out.println("남은 빵의 개수: " + remainder);
	}
}

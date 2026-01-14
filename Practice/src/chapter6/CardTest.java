package chapter6;

public class CardTest {

	public static void main(String[] args) {
		//카드 회사 객체 생성
		CardCompany company = CardCompany.getInstance();
		
		//카드 객체 생성
		Card card1 = company.createCard();
		Card card2 = company.createCard();
		Card card3 = company.createCard();
				
		//카드 가져오기
		System.out.println("카드번호: " + card1.getCardNumber());
		System.out.println("카드번호: " + card2.getCardNumber());
		System.out.println("카드번호: " + card3.getCardNumber());
	}

}

package chapter09;

public class CardCompany {

	private static CardCompany instance = new CardCompany();
	
	private CardCompany() {} //클래스를 private으로 박아버리기 = 싱글톤이구나
	
	public static CardCompany getInstance() {
		return instance;
	}//getInstance 메서드를 통해 하나의 객체만을 생성
	
	public Card issueCard() {
		return new Card();
	}//issueCard를 할때마다 Card라는 객체를 실행

	//-------------------------------------------
	
	public static void main(String[] args) {
		
		/*
		CardCompany cardCompany1 = new CardCompany(); // 신한
		CardCompany cardCompany2 = new CardCompany(); // 국민
		
		Card card1 = cardCompany1.issueCard(); //신한 1000
		Card card2 = cardCompany2.issueCard(); //국민 1001 ( 1000이 나와야되는데 )
		Card card3 = cardCompany1.issueCard(); //신한 1002 ( 1001이 나와야되는데 )
		
		System.out.println("카드 1의 번호 : " + card1.getCardNumber());
		System.out.println("카드 2의 번호 : " + card2.getCardNumber());
		System.out.println("카드 3의 번호 : " + card2.getCardNumber());
	
		 */
		
		CardCompany cardCompany = CardCompany.getInstance();
		Card card1 = cardCompany.issueCard();
		Card card2 = cardCompany.issueCard();
		Card card3 = cardCompany.issueCard();
		
		System.out.println("카드 1의 번호 : " + card1.getCardNumber());
		System.out.println("카드 2의 번호 : " + card2.getCardNumber());
		System.out.println("카드 3의 번호 : " + card2.getCardNumber());
		
	}

}

package chapter09;

public class Card {
	
	private static int cardCounter = 1000;
	private int cardNumber;
	
	
	public Card () {
		cardNumber = cardCounter++;
	}

	//---------------------------------------
	public int getCardNumber() {
		return cardNumber;
	}//생성자
	//---------------------------------------

}

package chapter13;

public interface Buy {
	
	void buy();
	
	default void buyOrder() {
		System.out.println("구매 주문");
	}
}

//---------------------------------------------

interface Sell {

	void sell();
	
	default void sellOrder() {
		System.out.println("판매 주문");
	}
}

//---------------------------------------------

class Customer implements Buy,Sell {

	@Override
	public void buy() {
		System.out.println("구매하기");
	}
	
	@Override
	public void sell() {
		System.out.println("판매하기");
	}
}







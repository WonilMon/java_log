package chapter13;

public class BuyMain {

	public static void main(String[] args) {
		
		Customer customer = new Customer();
		
		System.out.println("---Buy---");
		Buy buyer = customer; //Buy(인터페이스부모) - Customer(자식클래스) : 업캐스팅
		buyer.buy(); 
		buyer.buyOrder(); 
		
		System.out.println("---Sell---");
		Sell seller = customer; //Sell(인터페이스부모) - Customer(자식클래스) : 업캐스팅
		seller.sell(); 
		seller.sellOrder(); 
		
		//----------이건 당연히 안되겠죠-----------
		//buyer.sell();
		//buyer.sellOrder();
		//seller.buy();
		//seller.buyOrder();
		
		//----------다운 캐스팅을 통해서-----------
		
		System.out.println("-------------------------");
		
		Customer customer2 = (Customer)buyer;
		customer2.sell();
		customer2.sellOrder();
		customer2.buy();
		customer2.buyOrder();
		
		System.out.println("-------------------------");
		
		Customer customer3 = (Customer)seller;
		customer3.sell();
		customer3.sellOrder();
		customer3.buy();
		customer3.buyOrder();
		
		/* 
		<Buy 의 경우>
		
		Buy(부모) a = new Customer(자식) 업캐스팅을 통해서
		a 는 Customer(자식)의 값을 덮어씌운 Buy(부모)가 된다
		
		=> 이 상황에선 a 는 절대 Sell(부모)의 변수와 메서드를 이용 불가
		
		=> 따라서 Customer b = (Customer) a ; 다운캐스팅을 통해서
		   b.sell 이 가능하게끔 만들어준다
		 
		*/

	}

}

package chapter10;

public class CustomerMain {

	public static void main(String[] args) {
		
		int price = 10000;

		//일반고객1
		System.out.println("------------일반고객1------------");
		Customer cs1 = new Customer();
		cs1.setCustomerName("이예찬");
		System.out.println(cs1.getCustomerName() + "님이 " + cs1.calcPrice(price) + "원을 지불하셧습니다");
		System.out.println(cs1.showCustomer());
		
		//일반고객2
		System.out.println("------------일반고객2------------");
		Customer cs2 = new Customer(1001, "김하경");
		System.out.println(cs2.getCustomerName() + "님이 " + cs2.calcPrice(price) + "원을 지불하셧습니다");
		System.out.println(cs2.showCustomer());
		
		//VIP고객
		System.out.println("------------VIP고객------------");
		CustomerVIP vip1 = new CustomerVIP(1001, "임승연", 486);
		System.out.println(vip1.getCustomerName() + "님이 " + vip1.calcPrice(price) + "원을 지불하셧습니다");
		System.out.println(vip1.getCustomerName() + "님이 " + vip1.calcPrice(price) + "원을 지불하셧습니다");
		System.out.println(vip1.showCustomer());
		
		
	}//main

}//class

package chapter11;

import chapter10.Customer;
import chapter10.CustomerVIP;

public class OverridingTest01 {

	public static void main(String[] args) {
		
		Customer lee = new Customer(10001, "이순신");
		lee.setBonusPoint(1000);
		System.out.println(lee.showCustomer());
		
		CustomerVIP kim = new CustomerVIP(1002, "김유신", 1004);
		kim.setBonusPoint(1000);
		System.out.println(kim.showCustomer());
	}
	
	
	
}

package chapter07.Example02;

import chapter07.Example02.Store;

public class Customer {

	private String name;
	private int money;
	
	//생성자 오버로딩
	public Customer(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	//매개변수에는 클래스'Store' 등도 갖다 놓을 수 있다. 그 클래스의 메서드(sellCoffee) 사용가능
	public void buyCoffee(Store store, String coffeeType) {
		
		int money = store.sellCoffee(coffeeType); //Main에서 끌고 온 (,)값을 넣고 Store의 sellCoffee로 보냄
		this.money -= money;
		
		System.out.println(this.name + "님이 " + coffeeType + "를 구매, " + money + "원을 지급하셨습니다");
		
	}//buyCoffee
	
	public void showInfo() {
		System.out.println(name + "님의 남은 금액 : " + money + "원입니다");
	}
	
}

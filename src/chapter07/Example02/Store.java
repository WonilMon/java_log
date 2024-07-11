package chapter07.Example02;

public class Store {
	
	private String name;
	private int money;
	private int count;
	
	private int americano = 2000;
	private int latte = 3000;
	private int cappuccino = 3500;
	private int mocha = 4500;
	
	//생성자 오버로딩
	public Store(String name) {
		this.name = name;
	}
	
	public int sellCoffee(String coffeeMenu) {
		
		//sellCoffe의 coffeeMenu에서 받은 값으로 switch선택 후 리턴값이 다시 Customer의 money로 반환
		
		switch (coffeeMenu) {
		case "아메리카노":
			money += americano;
			count++;
			System.out.println("아메리카노를 제조했습니다");
			return americano;
		case "라떼":
			money += latte;
			count++;
			System.out.println("라떼를 제조했습니다");
			return latte;
		case "카푸치노":
			money += cappuccino;
			count++;
			System.out.println("카푸치노를 제조했습니다");
			return cappuccino;
		case "모카":
			money += mocha;
			count++;
			System.out.println("모카를 제조했습니다");
			return mocha;
			
		default:
			System.out.println("그 음료는 매장에 없습니다");
			return 0;
		}
		
	}//sellCoffee
	
	public void showInfo() {
		
		System.out.println(name + "맥장의 수익은 " + money + "원이고, 이용 고객의 수는 " + count + "입니다");
		
	}//showInfo
	
}

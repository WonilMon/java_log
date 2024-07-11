package chapter07.Example;

public class Coffee {

	private String name;
	private int money;
	
	//생성자
	public Coffee() {}
	//오버로딩함으로써 이름과 가격을 가진 객체
	public Coffee(String name, int money) {
		this.name = name;
		this.money = money;
	}	
	//disp 메서드
	public void disp () {
		
		System.out.println(name + " | " + money + "원");

	}

	//get
	public String getName() {
		return name;
	}

	public int getMoney() {
		return money;
	}
	
}

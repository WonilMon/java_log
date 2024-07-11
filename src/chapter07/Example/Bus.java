package chapter07.Example;

public class Bus {

	//멤버변수
	int busNumber;
	int passengerCount;
	int money;
	
	public Bus (int busNumber) {
		this.busNumber = busNumber;
	}
	
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	//멤버변수가 private인 경우 이렇게 take 메서드를 생성하여 다른 클래스에서 사용
	
	public void showInfo() {
		System.out.println("버스" + busNumber + "번의 승객은" + passengerCount + "명이고, 수입은 " + money + "입니다");
	}
	
}//class

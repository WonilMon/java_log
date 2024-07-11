package chapter11;

public class Vehicle {
	
	private static final int price = 1000; //static으로 설정돼있어도 private이죠? 가져올려면 메서드이용해야겠죠
	
	public int vehiclePrice () { //이런식으로 public 메서드
		return this.price;
	}
	
	public void run () {
		System.out.println("차량이 달립니다");
	}
	
}

//=========================================================================

class Driver {
	
	public void drive (Vehicle v) { //참조변수의 주소값을 원하는것
		v.run();
		
	}
	
}

//=========================================================================

class Bus extends Vehicle{
	
	private int busNum = 1000;
	
	@Override
	public void run() {
		System.out.println(busNum + "번 버스가 달립니다");
	}
	
}

//=========================================================================

class Taxi extends Vehicle {
	
	private int taxiNum = 1005;
	
	@Override
	public void run() {
		System.out.println(taxiNum + "번 택시가 달립니다");
	}
	
}

//=========================================================================


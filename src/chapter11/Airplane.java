package chapter11;

public class Airplane {
	
	public void land () {
		System.out.println("착륙합니다");
	}
	public void fly () {
		System.out.println("일반비행입니다");
	}
	public void takeoff () {
		System.out.println("이륙합니다");
	}
	
}

//-----------------------------------------------------

class AirplaneSupersonic extends Airplane {
	
	public final static int NORMAL = 1; //final 상수
	public final static int SUPERSONIC = 2; //final 상수
	public int flyMode = NORMAL;
	
	//NORMAL = 3; 
	
	@Override
	public void fly() {
		if(flyMode==SUPERSONIC) {
			System.out.println("초음속비행입니다");
		}else {
			super.fly();
		}
	}
	
}
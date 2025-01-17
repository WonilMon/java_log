package chapter12;

public abstract class Car {
	
	public abstract void drive ();
	public abstract void stop ();
	
	public void startCar () {
		System.out.println("시동을 켭니다");
	}
	
	public void turnOff () {
		System.out.println("시동을 끕니다");
	}
	
	public final void run () { //중복을 피하기 위한 변경불가 상수 메서드 
		startCar();
		drive();
		stop();
		turnOff();
	}
	
}

//==========================================================

class AICar extends Car {
	@Override
	public void drive() {
		System.out.println("자율 주행을 합니다");
		System.out.println("자동차가 스스로 방향을 전환합니다");
	}
	@Override
	public void stop() {
		System.out.println("스스로 정지를 합니다");
	}
}

//==========================================================

class ManualCar extends Car {
	@Override
	public void drive() {
		System.out.println("사람이 운전을 합니다");
		System.out.println("사람이 핸들을 조작합니다");
	}
	@Override
	public void stop() {
		System.out.println("브레이크로 정지를 합니다");
	}
}
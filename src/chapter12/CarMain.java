package chapter12;

public class CarMain {

	public static void main(String[] args) {
		
		System.out.println("-------- 자율주행 --------");
		Car myCar1 = new AICar(); //업캐스팅(부모선언/자식개체)
		
		myCar1.run();
		
		/*
		myCar1.startCar(); //추상클래스에서 정의한 일반 메서드
		myCar1.drive(); //자식클래스의 재정의 메서드
		myCar1.stop(); //자식클래스의 재정의 메서드
		myCar1.turnOff(); //추상클래스에서 정의한 일반 메서드
		*/
		
		System.out.println("-------- 사람이 운전하는 자동차 --------");
		Car myCar2 = new ManualCar(); //업캐스팅(부모선언/자식개체)
		
		myCar2.run();
		
		/*
		myCar2.startCar(); //추상클래스에서 정의한 일반 메서드
		myCar2.drive(); //자식클래스의 재정의 메서드
		myCar2.stop(); //자식클래스의 재정의 메서드
		myCar2.turnOff(); //추상클래스에서 정의한 일반 메서드
		*/
		
	}

}

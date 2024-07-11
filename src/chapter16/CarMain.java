package chapter16;

public class CarMain {

	public static void main(String[] args) {
		
		Car myCar1 = new Car("제네시스", 100);
		myCar1.start();
		
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		
		CarInner myCar2 = new CarInner("쏘나타", 98);
		myCar2.start();
		

	}

}

package chapter08_re;

public class CarMain {

	public static void main(String[] args) {
		
		Car myCar = new Car("검정", 3000);
		System.out.println(myCar.getColor() + ", " + myCar.getCc() );
		
		myCar.setColor("빨강");
		myCar.setCc(2000);
		System.out.println(myCar.getColor() + ", " + myCar.getCc() );
		
	}
	
}

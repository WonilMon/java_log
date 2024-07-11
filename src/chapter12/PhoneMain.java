package chapter12;

public class PhoneMain {

	public static void main(String[] args) {
		
		//Phone phone = new Phone("홍길동"); //추상클래스는 객체로 만들수 없다
		SmartPhone smart = new SmartPhone("홍길동"); 
		System.out.println(smart.owner + "님");
		smart.turnOn();
		smart.interSearch();
		smart.turnOff();
	}

}

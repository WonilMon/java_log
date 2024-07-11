package chapter12;

public abstract class Phone { 
	//추상메서드없는 추상클래스.. 딱히 만들진않음
	//변수, 메서드 다 쓸 수 있음! 객체를 못쓰는 것 뿐 (생성자를 통해, 혹은 자식 통해 값주입도 가능 ㅇㅇ)
	
	public String owner;
	
	public Phone(String owener) {
		this.owner = owener;
	}
	
	public void turnOn() {
		System.out.println("폰 전원을 켭니다");
	}
	
	public void turnOff() {
		System.out.println("폰 전원을 끕니다");
	}
	
}

//--------------------------------------------------

class SmartPhone extends Phone {
	
	public SmartPhone(String owner) {
		//super 쓴 다음 값을 주입할 수 밖에 없다 객체 소환을 위해
		super(owner);
	}
	
	public void interSearch() {
		System.out.println("인터넷 검색을 합니다");
	}
}





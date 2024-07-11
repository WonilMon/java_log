package chapter13;

public class SearchableMain {

	public static void main(String[] args) {
		
		SmartTelevision tv = new SmartTelevision();
		tv.turnOn();
		tv.setVolume(25);
		tv.search("www.naver.com");
		tv.turnOff();
		System.out.println("----------------------");
		
		Remote rc = tv; //Remote 인터페이스 선언 후, 자식의 주소값을 넣기 (Remote(부모)의 영역에 SmartTV(자식)을 덮어씌우기)
		rc.turnOn();
		rc.setVolume(-5);
		//rc.search("www.naver.com"); //Remote 가 아닌 다른 인터페이스의 것
		rc.turnOff();
		
		System.out.println("----------------------");
			
		Searchable sc = tv; // Search able (부모)의 영역에 SmartTV(자식)을 덮어씌우기 
		//rc.turnOn();
		//rc.setVolume(-5);
		sc.search("www.naver.com"); 
		//rc.turnOff();

	}

}

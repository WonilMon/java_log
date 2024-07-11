package chapter12;

public abstract class Computer { //객체를 만들 수 없다

	public void turnOn () {
		System.out.println("전원을 켭니다");
	}
	
	public void turnOff () {
		System.out.println("전원을 끕니다");
	}

	public abstract void typing ();
	public abstract void display ();
	//abstract class 에서만 사용 가능
	//오직 하위클래스의 재정의를 위한 메서드
	//아, 이 클래스를 상속받은 애들은 대충 어떤 기능을 하겠구나 ~ 라고 유추가능
}

//============================================================

class DeskTop extends Computer {
	
	@Override
	public void display() {
		System.out.println("DeskTop의 display()메서드");
	}
	
	@Override
	public void typing() {
		System.out.println("DeskTop의 typing()메서드");
	}
	
}

//============================================================

abstract class NoteBook extends Computer {
	//부모의 클래스 중에서 하나라도 재정의하지 않으면 추상클래스
	
	@Override
	public void display() {
		System.out.println("NoteBook의 display()메서드");
	}
	
}

//======================해결방안=================================

class MyNoteBook extends NoteBook {
	
	@Override
	public void typing() {
		System.out.println("MyNoteBook의 typing()메서드");
	}
	
}








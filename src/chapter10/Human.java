package chapter10;

public class Human {

	public void action () {
		System.out.println("사람은 행동을 합니다");
	}
	
}//Human // 부모클래스

//-----------------------------------------------------------

class Student extends Human{
	
	@Override
	public void action() {
		System.out.println("학생은 공부를 합니다");
	}
	
}//Student

//-----------------------------------------------------------

class Professor extends Human {
	
	@Override
	public void action() {
		System.out.println("교수는 수업을 합니다");
	}
	
}//Professor
package chapter11;

public class Human {
	public void action () {
		System.out.println("사람이 행동합니다");
		
	}
}

//-----------------------------------------------

class Student extends Human {
	@Override
	public void action() {
		System.out.println("학생이 오토바이를 탑니다");
	}
}

//-----------------------------------------------

class Professor extends Human {
	@Override
	public void action() {
		System.out.println("교수가 시험지를 채점 중입니다");
	}
}

//-----------------------------------------------

class SalesMan extends Human {
	@Override
	public void action() {
		System.out.println("사원이 미팅을 기획합니다");
	}
}
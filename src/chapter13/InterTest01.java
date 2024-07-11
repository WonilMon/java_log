package chapter13;

public interface InterTest01 {
	final int A = 100;
	
	abstract int getA();
}

/*
인터페이스같은 경우 상수 선언하면 자식(implements)에다가 메서드 하나 만든다음 보내는게 일반적임
 */

//-------------------------------------------------

class InterTest02 implements InterTest01 {
	
	@Override
	public int getA() {
		return A; //상수 A 반환
	}
	
}



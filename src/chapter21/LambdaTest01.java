package chapter21;

@FunctionalInterface
interface A {
	void print();
}
//------------------------------------------------------------------------------------
class B implements A {
	@Override
	public void print() {
		System.out.println("#1 재정의해서 사용");
	}
}
//------------------------------------------------------------------------------------
public class LambdaTest01 {
	public static void main(String[] args) {
		
		//#1 객체지향 프로그래밍 문법
		//상속받는 클래스(B)를 만들고, 재정의해서 사용
		A a = new B();
		a.print();
		
		//------------------------------------------------------
		
		//#2 객체지향 프로그래밍 문법(익명클래스)
		//클래스를 여러개만드는게 부담돼서 만들어진 게 익명클래스(한번쓰고 버리기)
		A a2 = new A () {			//메서드를 다 가져와서
			public void print() {	//개별 재정의 (람다와 달리 인터페이스의 여러 추상메서드가 있어도 가능)
				System.out.println("#2 재정의해서 사용(익명클래스)");
			}
		};
		a2.print();
		
		//------------------------------------------------------
		
		//#3 람다식
		//매개변수와 조건 (익명클래스에서 new 삭제, 재정의 메서드 삭제, 구현부만)
		//인터페이스의 추상메서드가 2개라면 람다는 사용못함 (람다가 추론으로 끌고오기 때문에)
		//람다를 쓰기위해 인터페이스 제약을 줄 수 있음 (@FunctionalInterface)
		A a3 = () -> {System.out.println("#3 람다");};
		a3.print();
		A a4 = () -> System.out.println("#3 람다");
		a4.print();
		//구현부의 내용이 한줄만 있으면 이렇게 사용가능
		
	}
}

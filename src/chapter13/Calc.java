package chapter13;

public interface Calc { 
	//추상메서드로만 이루어진 클래스 = 인터페이스
	//그걸 자식들이 받아서 다형성을 이루는 것
	
	double PI = 3.14; //final 안붙여도 상수처리
	int ERROR = -99999999;
	
	//구현구가 없는 메서드 = 추상 메서드 (abstract 생략가능)
	int add(int num1,int num2);
	int substract(int num1,int num2);
	int times(int num1,int num2);
	int divide(int num1,int num2);
	
	default void description () { //디폴트 메서드 : 재정의 가능
		System.out.println("정수 계산기를 구현합니다");
		myMethod();
		myStaticMethod();
	}
		
	private void myMethod () {
		System.out.println("private  메서드 입니다");
	}
	
	private static void myStaticMethod () {
		System.out.println("private static 메서드입니다");
	}

}
 //인터페이스 요소
/*
 	추상 메서드 : 구현부가 없는 메서드, 재정의 필요
 	디폴트 메서드 : 구현부가 있는 메서드, 재정의 가능
 	private (+ static) 메서드 : 인터페이스를 구현한 클래스에서만 사용 가능, 재정의 불가
*/

//-------------------------------------------------------------

abstract class CompleteCalc01 implements Calc { //인터페이스를 상속받으려면 implement 를 써야함
	
	@Override
	public int add(int num1,int num2) {
		return num1 + num2;
	}
	@Override
	public int substract(int num1,int num2) {
		return num1 - num2;
	}
}


//-------------------------------------------------------------

class CompleteCalc02 extends CompleteCalc01 { //extends
	
	@Override
	public int times(int num1,int num2) {
		return num1 * num2;
	}
	@Override
	public int divide(int num1,int num2) {
		if(num2!=0) {
			return num1 / num2;
		}else {
			return Calc.ERROR; //점 찍고 상수값 하면 그대로 가져올수있음
		}
	}
	
	public void showInfo () {
		System.out.println("Calc 인터페이스를 구현했습니다");
	}
}


















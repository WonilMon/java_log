package chapter11;

public class Calculator {
	
	double areaCircle(double r) {
		System.out.println("계산기 메서드 areaCircle() 실행");
		return r*r*3.141592;
	}
	
}

//----------------------------------------------------------

class Computer extends Calculator {
	
	@Override
	double areaCircle(double r) {
		System.out.println("컴퓨터 메서드 areaCircle() 실행");
		return Math.PI*r*r;
	}
	
}

//----------------------------------------------------------


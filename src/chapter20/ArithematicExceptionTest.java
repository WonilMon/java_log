package chapter20;

class Calculator {
	
	public int divide (int num1, int num2) {
		int result = num1/num2;
		return result;
	}
	
}

//======================================================

public class ArithematicExceptionTest {

	public static void main(String[] args) {
		
		/*
		Calculator cal = new Calculator();
		int num = cal.divide(6, 0);
		
		System.out.println(num);
		*/
		
		try {
			Calculator cal = new Calculator();
			int num = cal.divide(6, 0);
			
			System.out.println(num);
			
		} catch (ArithmeticException e) {				//ArithmeticException : 수학적 예외를 처리
			System.out.println(e.getMessage());
		} finally {
			System.out.println();
		}
		
	}

}

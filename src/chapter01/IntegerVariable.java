package chapter01;

public class IntegerVariable {

	public static void main(String[] args) {
		
		short sVal = 10;
		byte bVal = 20;
		
		int result = sVal + bVal;
		
		System.out.println("두 수의 합 : " + result);
		System.out.println("두 수의 합 : " + sVal + bVal);//문자열 + 숫자는 문자열 우선이라 숫자도 문자열로 인식
		
		byte bbVal = 1;
		int iiVal = 5;
		
		int result2 = bbVal + iiVal;
		
		System.out.println(result2);
		
		int a = 10;
		double b = 20.0;

		int result3 = a + (int)b;
		double result4 = (double)a + b;

		System.out.println(result3);
		System.out.println(result4);

		
	}

}

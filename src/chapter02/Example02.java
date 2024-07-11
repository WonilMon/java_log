package chapter02;

public class Example02 {

	public static void main(String[] args) {
		
		//원의 넓이를 구하시오(반지름*반지름*3.14)
		//반지름 : 10, 3.14는 double로 정의하여 구하시오
		//반지름 변수이름(num1), 3.14 변수이름(pi), 넓이 변수이름(result)
		
		int num1 = 10;
		double pi = 3.14;
		
		double result = num1 * num1 * pi;
		
		
		System.out.println("원의 넓이 : " + result);
		
		

	}

}

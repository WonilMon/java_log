package chapter21;

import java.lang.reflect.Method;

interface A2 {
	void method1();
}	//입력X, 출력X
interface B2 {
	void method2(int b);
}	//입력O, 출력X
interface C2 {
	int method3();
}	//입력 X, 출력O
interface D2 {
	int method4(int d1, int d2);
}	//입력 O, 출력O

public class LambdaTest02 {

	public static void main(String[] args) {	//람다 꼭 복습 !!
		
		//#1 void
		A2 a2 = () -> System.out.println("#1 입력X,출력X");
		a2.method1();
		
		System.out.println("---------------------------------");
		
		//#2 void (매개변수 있는 경우)
		//매개변수 넣어놓고 화살표
		B2 b2 = (int b) -> {
				System.out.println("#2 입력O,출력X");
				System.out.println(b);
				};
		b2.method2(5);
		
		System.out.println("---------------------------------");
		
		//#3 int
		C2 c2 = () -> {
				int num = 3;
				System.out.println("#2 입력X,출력O");
				return num; 
			};
		System.out.println(c2.method3());
		//C2 c2 = () -> 3; (코드가 한 줄이면 return 값도 생략가능)
		
		System.out.println("---------------------------------");
		
		//#4 int (매개변수 있는 경우)
		/*
		D2 d2 = new D2() {

			@Override
			public int method4(int d1, int d2) {
				
				return d1 + d2;
			}
		};
		System.out.println(d2.method4(5, 4));
		*/
		D2 d2 = (num1, num2) -> num1 + num2;
		System.out.println(d2.method4(5, 4));
		//return 값도 한줄이면 생략가능
	}

}

package chapter06;

public class FunTest03 {

	public static void swap(int x, int y) {
		
		int temp1 = x;
		x = y;
		y = temp1;
		
		System.out.println("swap()함수의 결과값 : a=" + x + ", b=" + y);
		
	}
	
	
	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		
		System.out.println("swap()함수 호출 전 : a=" + a + ", b=" + b);
		swap(a,b);
		
		
		

	} //main

} //class

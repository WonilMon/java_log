package chapter07;

public class ComputerMain {
	
	public static void main(String[] args) {
		
		Computer myCom = new Computer();
		int values1 [] = {1,2,3};
		int result = myCom.sum1(values1);
		System.out.println("result : " + result);
		
		int values2 [] = {1,2,3,4,5};
		result = myCom.sum1(values2);
		System.out.println("result : " + result);
		
		//----------------------------------------
		
		int a = 1;
		int b = 2;
		int c = 3;
		int d = 4;
		int e = 5;
		
		result = myCom.sum2(a, b, c, d);
		System.out.println("result : " + result);
		
	}//main

}//class

package chapter05;

public class ScopeTest01 {

	public static void main(String[] args) {
		
		int a = 10;
		
		if (true) {
			
			int b = 20; 
			System.out.println("a : " + a);
			System.out.println("b : " + b);
			
		} //if
		
		System.out.println("a : " + a);
		//System.out.println("b : " + b);

	} //main

}

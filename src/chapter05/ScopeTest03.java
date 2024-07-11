package chapter05;

public class ScopeTest03 {

	public static void main(String[] args) {
		
		/*
		int a = 10;
		int temp = 0;
		
		if (a>0) {
			
			temp = a*2;
			System.out.println("temp : " + temp);
			
		} //if
		*/
		
		int a = 10;
		
		if (a>0) {
			
			int temp = a*2;
			System.out.println("temp : " + temp);
			
		} //if
		
		

	} //main

}

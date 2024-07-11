package chapter05;

public class ScopeTest02 {

	public static void main(String[] args) {
		
		int a = 10;
		
		for (int i=0; i<2; i++) { 
			System.out.println("a : " + a);
			System.out.println("i : " + i);
		} //for
		
		// System.out.println("i : " + i); //오류 i 접근불가
		
	} //main

}

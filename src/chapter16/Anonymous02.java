package chapter16;

public class Anonymous02 {
	
	/*
	public static void helloJava() {
		System.out.println("프로그램 시작");
		System.out.println("Java");
		System.out.println("프로그램 종료");
	}
	public static void helloOracle() {
		System.out.println("프로그램 시작");
		System.out.println("Oracle");
		System.out.println("프로그램 종료");
	}
	*/
	
	public static void hello(String str) {
		System.out.println("프로그램 시작");
		System.out.println(str);
		System.out.println("프로그램 종료");
	}
	
	public static void main(String[] args) {
		
		hello("Java");
		System.out.println("----------------------------------");
		hello("Oracle");
		
	}
	
}

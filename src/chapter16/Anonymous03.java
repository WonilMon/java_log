package chapter16;

//===================================================

public class Anonymous03 {
	
	public static void hello(Process process) {
		System.out.println("프로그램 시작");
		process.run();
		System.out.println("프로그램 종료");
	}
	
	static class length implements Process {
		String str = "Hello World";
		@Override
		public void run() {
			System.out.println("\"Hello World\"의 문자열 길이 : " + str.length());
		}
	}
	
	static class sum implements Process {
		int sum = 0;
		@Override
		public void run() {
			for(int i=1;i<=3;i++) {
				sum+=i;}
			System.out.println("1부터 3까지의 합 : " + sum);
		}
	}
	
	public static void main(String[] args) {
		
		hello(new length());
		System.out.println("------------------");
		hello(new sum());
		
	}
	
	/* 내가 한 것
	
	public static void length() {
		String str = "Hello World";
		System.out.println("\"Hello World\"의 문자열 길이 : " + str.length());
	}
	
	public static void sum() {
		int sum = 0;
		for(int i=1;i<=3;i++) {
			sum+=i;}
		System.out.println("1부터 3까지의 합 : " + sum);
	}
	
	public static void typeShort(String what) {
		System.out.println("프로그램 시작");
		if(what.equals("length")) {
			length();
		}else if(what.equals("sum")) {
			sum();
		}
		System.out.println("프로그램 종료");
	}
	
	public static void main(String[] args) {
		
		typeShort("length");
		System.out.println("------------------");
		typeShort("sum");
		
	}
	
	*/
}

package chapter06;

public class FunTestOverloading {
	
	//오버로딩 : 메서드 명을 통일성 있게 사용해야 하는 경우, 메서드의 매개변수 종류나 개수를 다르게 하여 구현
	
	public void gerResult (int n) {
		
		System.out.println(n + "은(는) int입니다");
		
	}//gerResult
	
	public void gerResult (char n) {
		
		System.out.println(n + "은(는) char입니다");
		
	}//gerResult
	
	public void gerResult (String n) {
		
		System.out.println(n + "은(는) String입니다");
		
	}//gerResult
	
	public void gerResult (int n1, char n2, String n3) {
		
		System.out.println(n1 + "은(는) int이고, " + n2  + "은(는) char이고," + n3  +"은(는) String입니다");
		
	}//gerResult
	
	/*
	public static void main(String[] args) {
		
		int a = 5;
		char b = 'A';
		String c = "가나다";
		
		FunTestOverloading obj = new FunTestOverloading();
		
		obj.gerResult(a);
		obj.gerResult(b);
		obj.gerResult(c);
		obj.gerResult(a,b,c);

	}//main
	*/
	
}//class

package chapter15;

public class STringEqulas2 {
	
	public static void main(String[] args) {
		
		String str1 = new String("Hello");
		String str2 = new String("Hello");
		
		same(str1, str2); //false
		
		System.out.println("==========================");
		
		String str3 = "World";
		String str4 = "World";
		
		same(str3, str4); //true
		
	}
	
	public static void same (String str1, String str2) {
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2)); 
		//그냥 문자열은 무조건 equals 로 비교하는게 나음
	}
	
}

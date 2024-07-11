package chapter15;

public class StringTest02 {
	
	public static void main(String[] args) {
		
		String a = new String("Hello");
		String b = new String(" World");
		
		String result1 = a + b; //원래 참조변수끼리는 '+' 연산이 안되지만 편의상 제공
		
		System.out.println(result1);
		
		String result2 = a.concat(b);
		System.out.println(result2);
	}
	
}

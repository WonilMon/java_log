package chapter15;

public class StringTest01 {
	
	public static void main(String[] args) {
		
		String javaString = new String("Java"); //String 은 참조변수임. 일반변수가 아니라 ㅇㅇ
		String javaStringg = "Java"; 
		//Java 에서 허용해 준 것
		//String 은 char 의 배열 [] 이다
		
		System.out.println(javaString);
		System.out.println(javaString.hashCode());
		System.out.println(System.identityHashCode(javaString));
		
		System.out.println(javaStringg);
		
		System.out.println("=================================");
		
		//String 은 객체기 때문에 메서드도 사용가능
		javaString = javaString.concat(javaStringg); // c o n c a t  은 그냥 '+'의 역할
		System.out.println(javaString);
		
		
	}
	
}

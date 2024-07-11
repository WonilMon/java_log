package chapter16.Example;

public class OuterClass01 {
	
	private static String a = "Hello world";
	
	static class NestedClass {
		
		public void hello () {
			
			String b = "정적중첩클래스";
			
			System.out.println(a + " | " + b);
		}
		
		
	}
	
	
}

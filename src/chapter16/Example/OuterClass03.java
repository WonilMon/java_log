package chapter16.Example;

public class OuterClass03 {

private String a = "Hello";
	
	public void myMethod () {
		
		String b = " World";
		
		class LocalClass {
			
			private String c = "지역클래스";
			
			public void hello() {
			
			System.out.println(a + b + " | " + c);
			
			}
		
		}
		
		LocalClass local = new LocalClass();
		local.hello();
		
	}
	
}

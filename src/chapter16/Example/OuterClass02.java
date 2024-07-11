package chapter16.Example;

public class OuterClass02 {

	private String a = "Hello World";
	private String b = "내부클래스";
	private NestedClass nest;
			
	public OuterClass02 () {
		this.nest = new NestedClass();
	}
	
	public void hello () {
		nest.hello();
	}
	
	class NestedClass {
		
		public void hello () {
			
			System.out.println(a + " | " + b);
			
		}
		
	}
}

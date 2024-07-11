package chapter16.Example;

public class AnonymousTest {
	
	//Hello 익명클래스를 생성하고 hello()를 호출하세요
	public void test() {
		new AnonymousHello() {
			
			@Override
			public void hello() {
				System.out.println("Hello World | 익명클래스");
				
			}
		}.hello();
	}
	
	public static void main(String[] args) {
		
		AnonymousTest a = new AnonymousTest();
		a.test();
		
	}
	
}

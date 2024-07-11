package chapter16.Example;

public class OuterClassMain01 {
	
	//정적중첩클래스 NestedClass를 구현하고 hello()메서드를 만드세요
	public static void main(String[] args) {
		
		OuterClass01.NestedClass nest = new OuterClass01.NestedClass();
		nest.hello();
		
	}
	
}

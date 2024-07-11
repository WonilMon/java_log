package chapter10;

public class Child extends Parent {
	
	@Override
	public void method2() {
		System.out.println("재정의된 메서드");	
	}
	
	public void method3 () {
		System.out.println("자식의 메서드");
	}
	
}

class Parent {
	
	/* 
	public Child () {
		super();
	}
	 */
	
	public void method1() {
		System.out.println("부모메서드1");
	}
	
	public void method2() {
		System.out.println("부모메서드2");
	}
	
}

package chapter14;

public class Parent extends Object{

	public void parentMethod() {
		System.out.println("부모의 메서드");
	}
		
}

//---------------------------------------

class Child extends Parent{
	
	public void childMethod () {
		System.out.println("자식 메서드");
	}
	
}



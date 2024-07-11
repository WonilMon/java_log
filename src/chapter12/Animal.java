package chapter12;

public abstract class Animal {

	public abstract void sound();
}

//-------------------------------------------------------

class Cat extends Animal {
	
	@Override
	public void sound() {
		System.out.println("야옹");
		System.out.println("--------------------");
	}
	
}

//-------------------------------------------------------

class Dog extends Animal{
	
	@Override
	public void sound() {
		System.out.println("멍멍");
	}
	
}
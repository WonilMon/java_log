package chapter14.ToString;

public class Cat02 {
	
	private String name;
	
	public Cat02(String name) {
		this.name = name;
	}
}

//---------------------------------

class Dog02 {
	
	private String name;
	private int age;
	
	public Dog02(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		//return "Dog [name=" + name + ", age=" + age + "]";
		return "dogName : " + name + ", age : " + age;
	}
	
	
	
}
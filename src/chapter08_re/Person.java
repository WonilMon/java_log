package chapter08_re;

public class Person {

	String name;
	float height;
	float weight;
	
	public Person () {}
	
	public Person (String name) {
		this.name = name;
	}//오버로딩1
	
	public Person (String name, float height, float weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}//오버로딩2
	
}

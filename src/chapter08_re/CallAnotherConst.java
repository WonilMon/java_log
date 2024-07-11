package chapter08_re;

class Person2{
	
	String name;
	int age;
	
	public Person2 () {
		
		this("김씨", 55);
		
	}
	
	public Person2(String name, int age) {
		this.name = name;
		this.age = age;
	}//오버로딩
	
}//중첩class

public class CallAnotherConst {
	
	public static void main(String[] args) {
		
		Person2 p1 = new Person2();
		System.out.println("p1의 주소 : " + p1);
		System.out.println("P1의 name : " + p1.name);
		p1.name = "이씨";
		System.out.println("P1의 변경된 name : " + p1.name);
		
		System.out.println("------------------------");		
		
		Person2 p2 = new Person2();
		System.out.println("p2의 주소 : " + p2);
		System.out.println("P2의 name : " + p2.name);
		
		System.out.println("------------------------");
		
		Person2 p3 = p1;
		System.out.println("p3의 주소 : " + p3);
		System.out.println("P3의 name : " + p3.name);
		
		
		
	}//main
	
}//class

package chapter10;

public class ChildMain {

	public static void main(String[] args) {
		
		Parent p1 = new Parent();
		p1.method1(); //부모가 가진 메서드
		p1.method2(); //부모가 가진 메서드
		//p1.method3(); //자식이 가진 메서드 사용불가
		
		System.out.println("-----------------------");
		
		Child c1 = new Child();
		c1.method1();
		c1.method2();
		c1.method3();
		
		System.out.println("-----------------------");
		
		Parent p2 = new Child();//업캐스팅 : 자식이 가지고 있는 것을 부모에게 덮어씌운다
		//부모로 선언을 하고 자식을 호출
		p2.method1();
		p2.method2();
		//p2.method3();
		
		System.out.println("-----------------------");
		
		Parent p3 = new Child();
		Child c3 = (Child)p3; //다운캐스팅
		
		//같은 공간
		System.out.println(p3);
		System.out.println(c3); 
		
		if(p3 instanceof Child) {
		System.out.println("p3은 Child 타입을 가지고 있습니다");
		}
		
		c3.method1();
		c3.method2();
		c3.method3();
		
		System.out.println("-----------------------");
		
		Parent p4 = new Child();
		((Child)p4).method3();
		
		System.out.println("------------------------");
		
		Parent p5 = new Parent();
		
		if(p5 instanceof Child) { 
			Child c5 = (Child)p5;
			c5.method3();
			System.out.println("p5은 Child 타입을 가지고 있습니다");
		}else {
			System.out.println("p5은 Child 타입을 가지고 있지 않습니다");
		}
		
		if (p5 instanceof Parent) {
			System.out.println("p5은 Parent 타입을 가지고 있습니다");
		} else {
			System.out.println("p5은 Parent 타입을 가지고 있지 않습니다");
		}
		
		//c5.method3();
		//부모선언-부모호출에 자식을 씌워봐야 자식공간 자체가 없어서 디버깅
		
	}

}

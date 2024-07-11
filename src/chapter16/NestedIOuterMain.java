package chapter16;

import chapter16.NestedOuter.Nested;

public class NestedIOuterMain {

	public static void main(String[] args) {
		
		//NestedOuter outer = new NestedOuter(); => 사전작업이 불필요
		NestedOuter.Nested nestd = new NestedOuter.Nested();
		nestd.print();
		System.out.println("정적중첩클래스 : " + nestd); //내부 클래스는 $로 구분함
		
		System.out.println("===========================================");
		
		Nested nested1 = new Nested();
		
		nested1.print();
	}

}

package chapter18.ArrayList;

import java.util.ArrayList;

class Test {
	
	public void fatherMethod () {
		System.out.println("아버지 메서드");
	}
	
}

//==========================================================================================

class TestChild1 extends Test {
	
	@Override
	public void fatherMethod() {
		System.out.println("재정의한 아버지 메서드");
	}
	
	public void childMethod () {
		System.out.println("자식 메서드 1");
	}
	
}

//==========================================================================================

class TestChild2 extends Test {
	
	@Override
	public void fatherMethod() {
		System.out.println("재정의한 아버지 메서드");
	}
	
	public void childMethod () {
		System.out.println("자식 메서드 2");
	}
	
}

//==========================================================================================

public class ArrayListTest05 {

	public static void main(String[] args) {
		
		//배열로 하는법
		Test testArr [] = new Test[3];
		testArr[0] = new Test();
		testArr[1] = new TestChild1(); 				//업캐스팅1
		testArr[2] = new TestChild2();				//업캐스팅2
		System.out.println("---------------------");
		testArr[0].fatherMethod();
		testArr[1].fatherMethod();					//업캐스팅했으니 재정의된 아버지 메서드
		testArr[2].fatherMethod();					//업캐스팅했으니 재정의된 아버지 메서드
		System.out.println("---------------------");
		((TestChild1)testArr[1]).childMethod();   	//다운캐스팅
		((TestChild2)testArr[2]).childMethod(); 	//다운캐스팅
		
		System.out.println("=====================");
		
		//배열리스트로 하는법
		ArrayList<Test>testList = new ArrayList<Test>();
		testList.add(new Test());
		testList.add(new TestChild1());
		testList.add(new TestChild2());
		System.out.println("---------------------");
		testList.get(0).fatherMethod();
		testList.get(1).fatherMethod();
		testList.get(2).fatherMethod();
		System.out.println("---------------------");
		for(Test t : testList) {
			t.fatherMethod();	}
		System.out.println("---------------------");
		((TestChild1)testList.get(1)).childMethod();
		((TestChild2)testList.get(2)).childMethod();
		
	}

}











package chapter18.ArrayList;

import java.util.ArrayList;

class Shape {
	
	public void draw () {
		System.out.println("draw Shape");
	}
	
}

//================================================================================================

class Circle extends Shape {
	
	@Override
	public void draw() {
		System.out.println("draw Circle");
	}
	
	public void circle () { 							
		System.out.println("원모양입니다");
	}
	
}

//================================================================================================

class Rectangle extends Shape {
	
	@Override
	public void draw() {
		System.out.println("draw Rectangle");
	}
	
	public void rectangle () { 							
		System.out.println("사각형모양입니다");
	}
	
}

//================================================================================================

class Triangle extends Shape {
	
	@Override
	public void draw() {
		System.out.println("draw Triangle");
	}
	
	public void triangle () { 							
		System.out.println("삼각형모양입니다");
	}
	
}

//================================================================================================

public class ArrayListTest04 {
	
	ArrayList<Shape> sList = new ArrayList<Shape>(); 
	
	public static void main(String[] args) {
		
		ArrayListTest04 sTest = new ArrayListTest04();
		System.out.println("-----업캐스팅-----");
		sTest.addShape();
		
		System.out.println("-----다운캐스팅-----");
		sTest.testCasting();

	}//main
	
	public void addShape () { 					//Shape 을 상속받으므로 밑의 것 넣을수있음 (업캐스팅)
		sList.add(new Circle());
		sList.add(new Triangle());
		sList.add(new Rectangle());
		
		//역시 '주소값'을 받아서 for 문을 통해 그 안의 '메서드' 등을 배열로써 활용할 수 있음
		
		for(Shape s : sList) {
			s.draw();
		}
	}//addShape
	
	public void testCasting () { 				// 아버지타입으로 넣어놨기때문에 자식 고유메서드 못씀
		//(sList.get(0)).circle();			 	// 0번째의 circle 메서드를 쓰려고 해도 못씀 ㅇㅇ
			
			for(int i=0; i<sList.size(); i++) {
				Shape s = sList.get(i); 		// 깡통 객체인 s 에 순서대로 담는데,
				
				if(s instanceof Circle) {		// 만약 그게 해당 객체에 속하면?
					Circle c = (Circle)s;		// 다운캐스팅 (자식으로 형변환)
					c.circle();					// 자식 고유 메서드 가져오기
					
				}else if (s instanceof Rectangle) {
					Rectangle r = (Rectangle)s;
					r.rectangle();
					
				}else if (s instanceof Triangle) {
					Triangle t = (Triangle)s;
					t.triangle();
				}
				
			}
	}
	
}

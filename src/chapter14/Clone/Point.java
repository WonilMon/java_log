package chapter14.Clone;

public class Point {

	int x;
	int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString() {
		return "x = " + x +  ", y" +y;
	}
}

//-------------------------------------------

class Circle implements Cloneable {
	//implements 를 통해 클론이 가지고 있는 인터페이스 불러오기
	
	Point point;
	int radius;
	
	public Circle(int x,int y, int radius) {
		point = new Point(x,y);
		this.radius = radius;
	}
//------------------------------------------------------------------
	@Override
	public String toString() {
		return "원점은 " + point + "이고, 반지름은 " + radius + "입니다";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	//------------------------------------------------------------------	
}


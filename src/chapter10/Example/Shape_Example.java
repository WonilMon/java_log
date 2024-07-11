package chapter10.Example;

public class Shape_Example {

	public void draw () {
		System.out.println("그림을 그립니다");
	}
}

class Circle_Example extends Shape_Example {
	
	@Override
	public void draw() {
		System.out.println("원을 그립니다");
	}
}

class Square_Example extends Shape_Example {
	
	@Override
	public void draw() {
		System.out.println("네모를 그립니다");
	}
	
}

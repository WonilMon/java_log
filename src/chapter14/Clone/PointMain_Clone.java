package chapter14.Clone;

public class PointMain_Clone {
	
	public static void main(String[] args) throws CloneNotSupportedException { 
		//circleCopy는 클래스가 없으므로 그 오류를 방지하기 위해 '다운캐스팅' + 'throws' 기입 
		
		Circle circle = new Circle(10, 20, 30);
		Circle circleCopy = (Circle) circle.clone();
		
		//재정의를 하지않으면 객체끼리 복사 불가
		//따라서 Circle 클래스에서 재정의를 해줘야함
		
		System.out.println(circle);
		System.out.println(circleCopy);
		
		System.out.println(System.identityHashCode(circle));
		System.out.println(System.identityHashCode(circleCopy));
		//다른 주소값임 ㅇㅇ 그냥 카피일 뿐, 수정해도 영향 ㄴㄴ
	}

}

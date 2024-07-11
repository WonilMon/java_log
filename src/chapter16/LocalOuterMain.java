package chapter16;

public class LocalOuterMain {
	
	public static void main(String[] args) {
		
		InnerOuter outer = new InnerOuter(); //외부클래스가 객체로 생성되어야만 내부클래스도 생성
		InnerOuter.Inner inner = outer.new Inner(); // 이렇게 해줘야만 내부클래스가 실행됨
		inner.print();
		System.out.println(inner);
		
		//잘 안쓰는 방식이긴함. 그냥 꺼내올 수 있다는 것을 보여주기 위함
		
		System.out.println("--------------------------------------------------------");
		
		LocalOuter01 lo = new LocalOuter01(); //이 시점에선 지역 클래스가 개체로 안 만들어지죠
		lo.outMethod(3);                      //그러나 지역클래스 소속 메서드가 수행하는 순간 !!
	}
	
}

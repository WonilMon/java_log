package chapter16;

public interface Printer {
	
	void print(); // 추상메서드
	
}

//===================================class===================================

class LocalOuter02 { 
	
	private int outInstanceVal = 1; //외부클래스의 멤버변수
	
	public void outMethod(int paramVal) { 
		
		
		int localVal = 2; 
		
		class LocalClass implements Printer { //지역클래스도 implements 가능하다는 점만 명심
			
			int localClassInstanceVal = 4; 
			
			@Override
			public void print() {
				System.out.println("외부클래스 멤버변수를 가져옴 : " + outInstanceVal);
				System.out.println("외부클래스 메서드의 지역변수를 가져옴 : " + localVal);
				System.out.println("외부클래스 메서드의 매개변수를 가져옴 : " + paramVal);
				System.out.println("지역클래스 멤버변수를 가져옴 : " + localClassInstanceVal);
			}
			
		} //지역클래스
		
		LocalClass lc = new LocalClass();
		lc.print();
		
		
	} //외부클래스 메서드
	
} //외부클래스


package chapter16;

public class LocalOuter01 { 
	
	private int outInstanceVal = 1; //외부클래스의 멤버변수
	
	public void outMethod(int paramVal) { //외부클래스의 메서드(매개변수)
		//'메서드'를 실행해야만 지역클래스가 실행됨. (클래스-클래스보다 메모리 낭비 줄일 수 있죠)
		
		int localVal = 2; // 외부클래스 메서드의 지역변수
		
		
		class LocalClass { 
			//메서드 안에다 클래스를 선언할 수 있음
			//지역 클래스는 지역변수처럼 접근지정자 불가
			
			int localClassInstanceVal = 4; //지역클래스의 멤버변수
			
			public void LocalMethod () { //지역변수의 특징
				System.out.println("외부클래스 멤버변수를 가져옴 : " + outInstanceVal);
				System.out.println("외부클래스 메서드의 지역변수를 가져옴 : " + localVal);
				System.out.println("외부클래스 메서드의 매개변수를 가져옴 : " + paramVal);
				System.out.println("지역클래스 멤버변수를 가져옴 : " + localClassInstanceVal);
			}
			
		} //지역클래스
		
		LocalClass lc = new LocalClass();
		lc.LocalMethod();
		//수행하는 순간 지역클래스가 만들어지고 지역클래스의 메서드를 수행
		
	} //외부클래스 메서드
	
} //외부클래스

//============================CLASS============================

class InnerOuter {
	
	private static int outClassValue = 3;
	private int outInstanceValue = 2;
	
	class Inner { 
		
		private int innerInstanceValue = 1;
		
		public void print () {
			System.out.println(innerInstanceValue); //내부클래스의 멤버변수
			System.out.println(outInstanceValue); //외부클래스의 멤버변수 
			System.out.println(outClassValue);//외부클래스의 정적멤버변수 (private static 이어도 가능)
		}
		
	}//내부클래스
	
}//외부클래스
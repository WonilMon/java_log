package chapter16;

public class NestedOuter {

	
	private static int outValueStatic =3;
	private        int outValue = 2; // X
	
	static class Nested{ 
		// 정적 중첩 클래스 
		// 내부에서 돌리기 위해 만들어진 것 
		// 다른 클래스에서 쓸거면 굳이 할 필요없져
		
		private int nestedInstanceValue = 1;
		
		public void print () {
			System.out.println(nestedInstanceValue); //정적중첩클래스의 멤버변수
			System.out.println(outValueStatic); //외부클래스의 static 변수 (접근 o) 
			//System.out.println(outValue); //외부클래스의 인스턴스 멤버변수 (접근 x)
 		}
		
	}
	
}

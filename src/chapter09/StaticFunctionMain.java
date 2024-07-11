package chapter09;

public class StaticFunctionMain {

	public static void main(String[] args) {
		
		System.out.println(StaticFunction.getStatic2());
		//객체 호출이 아닌 그냥 클래스명으로 불러오기
		
		String s = StaticFunction.str2;
		System.out.println(StaticFunction.getStatic2());
		
		/*
		StaticFunction st = new StaticFunction();
		
		System.out.println(st.getStatic1());
		System.out.println(st.getStatic2());
		 */
		//원래는 이런식으로 객체 선언 및 불러오기 해야 함 
		
	}

}

package chapter09;

public class StaticFunction {

	String str1 = "일반 회원변수";
	static String str2 = "static 회원변수"; //정적 변수
	
	public String getStatic1 () {
		return str1;
	}
	
	public static String getStatic2 () {
		return str2;
	}//정적 메서드
	
}

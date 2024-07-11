package chapter15;

public class StringEquals01 {

	public static void main(String[] args) {
		
		String str1 = new String("Hello");
		String str2 = new String("Hello");
		
		//'객체'이니까 다르게 스택이되고 힙공간도 따로 씀. 단지 값만 같을 뿐
		System.out.println("== 비교 : " + (str1 == str2)); //false
		//String 은 이미 Object equals 가 적용돼서 재정의할 필요 없죠?
		System.out.println("equals 비교 : " + (str1.equals(str2))); //true
		
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2)); 
		
		System.out.println("===============================================");
		
		String str3 = "Hello";
		String str4 = "Hello";
		
		System.out.println("== 비교 : " + (str3 == str4)); //true
		System.out.println("equals 비교 : " + (str3.equals(str4))); //true
		//문자열 풀 : 성능 최적화 
		//String 은 클래스에 문자열 리터널이 있으면 문자열 풀에 String 인스턴스를 미리 만들고,
		//같은 문자열이 있으면 인스턴스를 더이상 생성하지 않음
		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));
		
		
		//1번은 new 로 따로 공간을 만들어놓고 집어넣는 개념이면,
		//2번은 바로 그 객체를 바라보게끔 만듦. (성능 훨씬 좋음)
	}

}

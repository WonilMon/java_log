package chapter15;

public class StringImmutable {
	
	public static void main(String[] args) {
		
		String str1 = "Hello";
		str1.concat(" java"); //str1 에 직접 넣어주지 않으면 c o n c a t 이 실행안됨 (final 로 설정되어있어서)
		System.out.println("str1 : " + str1);
		
		str1 = str1.concat(" java"); //기존의 힙을 더이상 참조하지 않고, 새로운 힙을 만들어 Hello java 를 넣음
		System.out.println("str1 : " + str1);
		
		System.out.println("=======================================");
		
		String str2 = str1.concat(" java");
		System.out.println("str2 : " + str2);
		/*
		String 이 final 로 설정된 이유는 문자열 풀 때문,
		만약 String 객체의 값을 변경 시, 같은 문자열을 참조하는 다른 객체까지 내용이 변경
		*/
		
	}

}

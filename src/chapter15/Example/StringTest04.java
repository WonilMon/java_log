package chapter15.Example;

public class StringTest04 {

	public static void main(String[] args) {
		
		//str 의 앞뒤 공백을 제거하고, Java 를 Oracle 로 바꾼 후 str 의 모든 문자를 대문자로 만드세요
		
		String str = "    Hello Java    ";
		System.out.println(str);
		
		str = str.trim();
		str = str.replace("Java","Oracle");
		System.out.println(str.toUpperCase());
		

	}

}

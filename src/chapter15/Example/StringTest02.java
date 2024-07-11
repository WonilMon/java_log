package chapter15.Example;

public class StringTest02 {

	public static void main(String[] args) {
		
		String str = "Hello Java";
		
		//str 에서 'Java'문자열이 어디부서 시작하는지 위치를 찾아서 출력하시오
		
		System.out.println("str에서 'Java'가 시작하는 위치 : " + str.indexOf("Java"));
		
		System.out.println("--------------------------------");
		
		//str 에서 'Hello'와 'Java'를 분리하시오
		
		String arr[] = str.split(" ");
		
		System.out.println("Hello : " + arr[0]);
		System.out.println("Java : " + arr[1]);
		
	}

}

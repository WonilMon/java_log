package chapter15.Example;

public class StringTest05 {

	public static void main(String[] args) {
		
		//문자열을 @를 기준으로 나누셈
		String str = "soldesk@studesk.com";
		
		System.out.println("파일 이름 : " + str.substring(0,str.indexOf("@")));
		System.out.println("도메인 이름 : " + str.substring(str.indexOf("@")+1));
		
	}

}

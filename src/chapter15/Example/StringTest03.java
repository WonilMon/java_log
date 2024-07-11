package chapter15.Example;

public class StringTest03 {

	public static void main(String[] args) {
		
		//파일명과 확장자를 분리하시오
		String str = "안녕.txt";
		String ext = ".txt";
		
		System.out.println("파일이름 : " + str.substring(0,str.indexOf(ext)));
		System.out.println("확장자 : " + str.substring(str.indexOf(ext)));
		
	}

}

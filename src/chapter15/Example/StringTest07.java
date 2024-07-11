package chapter15.Example;

import java.util.Scanner;

public class StringTest07 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String str;
		String arr[];
		String join = null;
		
		System.out.print("문장을 입력하세요 : ");
		str = scan.nextLine(); // '/' 기준으로 분리하여 입력된 문자열에 하나로 담기
		if(str.contains("/")==true) {
			arr = str.split("/");
			for(String s : arr) {
				System.out.println(s);
			}
			join = String.join(", ",arr);
			System.out.println("입력된 문자열 : " + join);
			System.out.print("검색할 단어를 입력하세요 : ");
		}else {
			System.out.println(str);
			System.out.println("입력된 문자열 : " + str);
			System.out.println("프로그램을 종료합니다");
		}
	
		String search = scan.nextLine();
		if(join.contains(search)) {
			System.out.println("'" + search + "'는(은) 입력된 문자열에 포함되어 있습니다");
		}else { 
			System.out.println("'" + search + "'는(은) 입력된 문자열에 포함되어 있지 않습니다");
			
		}
		
	}

}

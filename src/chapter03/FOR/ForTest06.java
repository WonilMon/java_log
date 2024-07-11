package chapter03.FOR;

import java.util.Scanner;

public class ForTest06 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int i;
		System.out.print("숫자를 입력하세요 : ");
		int a = Integer.parseInt(scan.nextLine());
		
		if(a>0 && a<11) { 
			for (i=1; i<=a; i++) {
				System.out.println("!!! Java 프로그래밍 !!!");
			}
		} else {
			System.out.println("입력값이 잘못되었습니다");
		}
		System.out.println("수고하셨어용");
		
		
		
		
		
		
		
		
		
		
		
	}

}

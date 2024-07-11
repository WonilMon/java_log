package chapter03.SWITCH;

import java.util.Scanner;

public class SwitchCase04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("등급을 입력하세요 (A, B, C) : ");
		
		char grade;
		grade = scan.nextLine().charAt(0);
		String Q;
		
		switch (grade) {
		case 'A': case 'a':
			Q = "우수회원";
			System.out.println(Q + "입니다");
			break;
			
		case 'B': case 'b':
			Q = "일반회원"	;	
			System.out.println(Q + "입니다");
			break;
			
		case 'C': case 'c':
			Q = "비회원";
			System.out.println(Q + "입니다");
			break;

		default:
			System.out.println("다시 입력해주세요");
			break;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

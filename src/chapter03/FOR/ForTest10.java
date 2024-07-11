package chapter03.FOR;

import java.util.Scanner;

public class ForTest10 {

	public static void main(String[] args) {
		
		//구구단
		Scanner scan = new Scanner(System.in);
		System.out.print("단을 입력하세요 : ");
		int dan = Integer.parseInt(scan.nextLine());
		int i;
		
		for (i=1; i<=9; i++) {
			System.out.println(dan + "*" + i + "=" + (dan*i));
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

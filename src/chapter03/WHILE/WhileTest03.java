package chapter03.WHILE;

import java.util.Scanner;

public class WhileTest03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//&& 활용
		while (true) {
			System.out.print("Java 교과목 점수를 입력하세요 : ");
			int score = Integer.parseInt(scan.nextLine());
			
			if (score>=0 && score<60) {
				System.out.println("불합격입니다");
			} else if (score>=60 && score<=100) {
				System.out.println("합격입니다");
			} else {
				System.out.println("프로그램을 종료합니다");
				break;
			}
		}
		
		//||활용
		while (true) {
			System.out.print("Java 교과목 점수를 입력하세요 : ");
			int scr = Integer.parseInt(scan.nextLine());
			
			if (scr<0 || scr>100) {
				System.out.println("프로그램 종료");
				break;
			} else if (scr<60) {
				System.out.println("불합격");
			} else {
				System.out.println("합격");
			}
		}
		
		
		

	}

}

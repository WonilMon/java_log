package chapter06;

import java.util.Scanner;

public class Example01 {
	
	static int score [ ] = null;
	static int select;
	static int studentNum=0;
	static Scanner scan = new Scanner(System.in);
	
	public static void runProgram() { 
		
		while(true) {
			
			System.out.println("---------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("---------------------------------------------");
			System.out.print("선택> ");
			int select = Integer.parseInt(scan.nextLine());
			
			if (select == 1) {
				
				System.out.print("학생 수 > ");
				studentNum = Integer.parseInt(scan.nextLine());
				score = new int[studentNum];
				
			} //if
			else if (select == 2) {
				
				if (score != null) {
					for (int i = 0 ; i < score.length ; i++) {
						System.out.print("score [" + (i+1) + "] > ");
						score[i] = Integer.parseInt(scan.nextLine());
					} //for
				} //if
				else { 
					System.out.println("학생 수를 입력하세요");
				} // else
				
			} //else if
			else if (select == 3) {
				
				if (score != null) { 
					for(int i = 0 ; i < score.length ; i++) {
						System.out.println("score[" + (i+1) + "] : " + score[i]);
					} //for
				} //if
				else {
					System.out.println("학생 수를 입력하세요");
				} //else
				
			} //else if 
			else if (select == 4) {
				
				if(score != null) {
				
					int max = 0;
					int sum = 0;
					double avg = 0.0;
				
					for (int i = 0; i < score.length ; i++) {
						max = (max < score[i]) ? score[i] : max;
						sum += score[i];
					} //for
				
					avg = sum/(double)studentNum;
					System.out.println("최고점수 : " + max);
					System.out.println("총점 : " + sum);
					System.out.println("평균 : " + avg);
				
				} //if
				
				else {
					System.out.println("학생 수를 입력하세요");
				} //else
				
			} //else if
			else if (select == 5) {
				
				System.out.println("프로그램을 종료합니다");
				break;
				
			} //else if
			else {
				System.out.println("1부터 5 사이의 번호만 입력하세요");
			} //else
			
		} //while
		
	}
	
	public static void main(String[] args) {
		
		runProgram();

	} //main

} //class

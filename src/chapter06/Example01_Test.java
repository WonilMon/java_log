package chapter06;

import java.util.Scanner;

public class Example01_Test {
	
	static Scanner scan = new Scanner(System.in);
	static int score[] = null;
	static int studentNum;
	static int choice;

	public static void student() {
		
		System.out.print("학생수> ");
		studentNum = Integer.parseInt(scan.nextLine());
		
		if (studentNum<1) {
			System.out.println("다시 입력해주세요");
		}//if
		else {
			score = new int[studentNum];
		}//else
		
	} 
	
	public static void score() {
		
		if (score==null) {
			System.out.println("학생수를 먼저 입력해주세요");
		}//if
		else {
			for(int i=0;i<score.length;i++) {
			System.out.print("score[" + (i+1) + "] : ");
			int num = Integer.parseInt(scan.nextLine());
			score[i] = num;
			}//for
		}//else
		
	}
	
	public static void scoreCheck() {
		
		if (score==null) {
			System.out.println("학생수와 점수를 먼저 입력해주세요");
		}//if
		else {
			for(int i=0;i<score.length;i++) {
				System.out.println("score[" + (i+1) + "] : " + score[i]);
			}//for
		}
		
	}
	
	public static void analyze() {
		
		if (score==null) {
			System.out.println("학생수와 점수를 먼저 입력해주세요");
		}//if
		else {
			int max = 0;
			int sum = 0;
			double avg = 0.0;
		
			for (int i = 0; i < score.length ; i++) {
				max = (max < score[i]) ? score[i] : max;
				sum += score[i];
			} //for
		
			avg = sum/(double)score.length;
			System.out.println("최고점수 : " + max);
			System.out.println("총점 : " + sum);
			System.out.println("평균 : " + avg);
		}//else
		
	}
	
	public static void end() {
		
		System.out.println("프로그램을 종료합니다");
		
	}
	
	public static void runProgram() { 
		
		do {
			
			System.out.println("-------------------------------------");
			System.out.println("1.학생수|2.점수입력|3.점수리스트|4.분석|5.종료");
			System.out.println("-------------------------------------");
			System.out.print("선택> ");
			choice = Integer.parseInt(scan.nextLine());
			
			if (choice == 1) {
				student();
			}//if
			else if (choice == 2) {
				score();
			}//else if
			else if (choice == 3) {
				scoreCheck();
			}//else if
			else if (choice == 4) {
				analyze();
			}//else if
			else if (choice ==5) {
				end();
				break;
			}//else if
			else {
				System.out.println("1~5까지의 번호만 눌러주세요");
			}//else
			
		}while (choice!=5);//do
		
	}//runProgram
	
	public static void main(String[] args) {
		
		runProgram();

	} //main

} //class

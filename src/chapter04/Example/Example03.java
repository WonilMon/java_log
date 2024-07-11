package chapter04.Example;

import java.util.Scanner;

public class Example03 {

	public static void main(String[] args) {
		
		//학생 수를 입력받아, 점수를 입력하고 점수리스트를 출력, 총점과 평균을 분석하시오
		
		Scanner scan = new Scanner(System.in);
		int score[] = null;
		int scoreNum;
		int choice;
		int num;
		int max=0;
		int sum=0;
		
		do { 
			
			System.out.println("--------------------------------------------------");
			System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
			System.out.println("--------------------------------------------------");
			
			System.out.print("선택> ");
			choice = Integer.parseInt(scan.nextLine());
			
			if (choice==1) {
				
				do {
					System.out.print("학생수> ");
					num = Integer.parseInt(scan.nextLine());
					
					if (num>0) {
						score = new int [num];	
					} else {
						System.out.println("잘못된 수를 입력하셨습니다");
					}
					
				} while (num<1);
				
			} else if (choice==2) {
				
				if (score==null) {
					
					System.out.println("학생수를 먼저 입력해주세요");
					
				} else {
				for (int i=0; i<score.length; i++) {
					
					System.out.print("score[" + (i+1) + "]> ");
					scoreNum = Integer.parseInt(scan.nextLine());
					
					if (scoreNum>0) {
						score[i] += scoreNum;
						sum+=score[i];
					} else {
						
						do {
						System.out.println("잘못된 수를 입력하셨습니다");	
						System.out.print("score[" + (i+1) + "]> ");
						scoreNum = Integer.parseInt(scan.nextLine());
						}while(scoreNum<=0);
						
						score[i] += scoreNum;
						sum+=score[i];
						
					}
					
				}
				
				for (int i=0; i<score.length;i++) {
					if (max < score[i]) {
						max = score[i];
					}
					
				}
				}
				
			} else if (choice==3) {
				
				if (sum==0) {
					System.out.println("점수를 먼저 입력해주세요");
				} else {
				
				for (int i=0; i<score.length;i++) {
					System.out.println("score[" + (i+1) + "] : " + score[i]);
				}
				}
				
			} else if (choice==4) {
				if (sum==0) {
					System.out.println("점수를 먼저 입력해주세요");
				} else {
				
				System.out.println("최고점수 : " + max);
				System.out.println("총점 : " + sum);
				System.out.println("평균 : " + (sum/(double)score.length));
				
				}
				
			} else if (choice==5) {
				
				break;
				
			} else {
				
				System.out.println("1~5까지의 번호만 눌러주세요");
				
			}
			
		} while (choice!=5);
		
		System.out.println("프로그램을 종료합니다");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

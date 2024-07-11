package chapter03.FOR;

import java.util.Scanner;

public class ForTest08 {

	public static void main(String[] args) {
		
		//학생의 인원 수와 점수를 입력받고, 학생들 점수의 총점과 평균을 구하시오
		Scanner scan = new Scanner(System.in);
		
		int i, score, sum=0;
		double avg = 0;
		
		System.out.print("몇명의 학생 점수를 입력받으시겠슴?");
		int stu = Integer.parseInt(scan.nextLine());
				
		for(i=1; i<=stu; i++) {
			System.out.print(i + "번째 학생 점수 입력 : ");
			score = Integer.parseInt(scan.nextLine());
			sum+=score;
		}
		avg = (double)sum/(double)stu;
		System.out.println("총점 : " + sum + "점, 평균 : " + avg + "점");
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

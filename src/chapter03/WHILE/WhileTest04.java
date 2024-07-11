package chapter03.WHILE;

import java.util.Scanner;

public class WhileTest04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int num, cnt=0, sum=0;
		double avg;
		
		while (true) {
			System.out.print("숫자를 입력하세요 : ");
			num = Integer.parseInt(scan.nextLine());
			cnt+=1;
			sum+=num;
			avg = (double)sum/(double)(cnt-1);
			
			if (num==0) {
				break;
			}
		}
		System.out.println("입력된 자료의 개수 : " + (cnt-1));
		System.out.println("입력된 자료의 합계 : " + sum);
		System.out.println("입력된 자료의 평균 : " + avg);
		
		
		//숫자 계속 입력하다 0 입력시 종료
		//n까지의 숫자 개수, 합계, 평균 출력
		
		
		
		
		
		
		
		
		
		
		

	}

}

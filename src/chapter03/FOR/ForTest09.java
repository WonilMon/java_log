package chapter03.FOR;

import java.util.Scanner;

public class ForTest09 {

	public static void main(String[] args) {
		
		//입력받은 수를 초과하면 반복문을 멈추는 조건
		Scanner scan = new Scanner(System.in);
		
		int i, sum = 0;
		
		System.out.print("정수를 입력하세요 : ");
		int num = Integer.parseInt(scan.nextLine());
		
		for (i=1; sum<num; i++) {
			sum+=i;
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println(sum);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

package chapter03.FOR;

import java.util.Scanner;

public class ForTest05 {

	public static void main(String[] args) {
		
		//문제1 : 정수를 입력받아(Scanner) 입력받은 정수로부터 100까지의 합을 출력하시오
		
		Scanner scan = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int i = Integer.parseInt(scan.nextLine());
		int sum = 0;
		int ii = i;
		
		for (i=i; i<=100; i++) {
			sum+=i;
		}
		System.out.println(ii + "부터 100까지의 합 : " + sum);
		System.out.println("---------------");
		
		//문제2 : 1부터 10까지 정수를 반복 입력받아 그 중 짝수의 개수가 몇 개인지 출력하시오
		
		Scanner scann = new Scanner(System.in);
		
		int a;
		int b = 0;
		
		for (a=1; a<=10; a++) {
			System.out.print(a + "번째 정수를 입력하시오 : " );
			int num = Integer.parseInt(scann.nextLine());
			if (num%2==0) {
				b+=1;
			}
		}
		System.out.println("입력받은 수의 짝수의 개수 : " + b);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

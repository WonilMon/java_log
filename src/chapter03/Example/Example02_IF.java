package chapter03.Example;

import java.util.Scanner;

public class Example02_IF {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int num;
		int money;
		int sum = 0;
		
		
		do {
			
			System.out.println("1. 예금 | 2. 출근 | 3. 잔고 | 4. 종료");
			System.out.println("--------------------");
			System.out.print("선택> ");
			num = Integer.parseInt(scan.nextLine());
			
			if (num==1) {
				System.out.print("예금액> ");
				money = Integer.parseInt(scan.nextLine());
				
				if (money <= 0) {
					System.out.println("잘못된 금액을 입력하셨습니다");
					System.out.println();
				} else {
					sum += money;
					System.out.println("잔액> " + sum);
					System.out.println();
				}
				
			} else if(num==2) {
				System.out.print("출금액> ");
				money = Integer.parseInt(scan.nextLine());
				
				if (sum < money) {
					System.out.println("잔액이 부족합니다");
					System.out.println();
				} else {
					sum -= money;
					System.out.println("잔액> " + sum);
					System.out.println();
				}
			
			} else if (num==3) {
				System.out.println("잔고액> " + sum);
				System.out.println();
			} else if (num==4) {
				System.out.println();
				break;
			} else {
				System.out.println("잘못된 번호를 입력하셨습니다");
			}
			
		} while (num!=4);
		
		System.out.println("프로그램을 종료합니다");

	}

}

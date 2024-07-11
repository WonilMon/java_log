package chapter03.Example;

import java.util.Scanner;

public class Example02_Switch {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		boolean run = true;
		int balance = 0;
		
		while (run) {
			System.out.println("----------");
			System.out.println(" 1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료 ");
			System.out.println("----------");
			System.out.print("선택> ");
			
			int menuNum = Integer.parseInt(scan.nextLine());
			int money = 0;
			
			
			switch (menuNum) {
			case 1:
				System.out.print("예금액> ");
				money = Integer.parseInt(scan.nextLine());
				
				if (money <= 0) {
					System.out.println("잘못된 금액을 입력하셨습니다");
					System.out.println();
				} else {
					balance += money;
					System.out.println("현재금액> " + balance);
					System.out.println();
				}
				
				break;
			case 2:
				while (true) {
				System.out.print("출금액> ");
				money = Integer.parseInt(scan.nextLine());
				balance -= money;
				
				if (balance < 0) {
					System.out.println("잔액이 부족합니다");
					balance += money;
					System.out.println("현재금액> " + balance);
					System.out.println();
				} else {
					System.out.println("현재금액> " + balance);
					System.out.println();
				}
				
				break;
				}
			break;
			case 3:
				System.out.println("잔고액> " + balance);
				System.out.println();
			break;
			case 4:
				run = false;
			break;

			default:
				System.out.println("잘못된 번호입니다");
				System.out.println();
				break;
			}
			
		}
		System.out.println("프로그램을 종료합니다");

	}

}

package chapter06;

import java.util.Scanner;

public class Example03_Teacher {
	
	public void makeBread(int cnt) {
		
		for (int i = 0 ; i < cnt ; i++) {
			System.out.println((i+1) + "번째 빵을 만들었습니다");
		}//for
		
		System.out.println("요청하신 " + cnt + "개의 빵이 모두 완료되었습니다");
	}//makeBread
	
	public void makeBread(int cnt,String name) {
		
		for (int i = 0 ; i < cnt ; i++) {
			System.out.println((i+1) + "번째 " + name + " 빵을 만들었습니다");
		}//for
		
		System.out.println("요청하신 " + cnt + "개의 " + name + " 빵이 모두 완료되었습니다");
	}//makeBread
	
	public void order () {
		Scanner scan = new Scanner(System.in);
		
		while (true) {
			
			System.out.println("------------------------------------------");
			System.out.print("1. 빵 갯수 선택 | 2. 빵의 갯수와 종류 | 3. 종료 : ");
			int input_num = Integer.parseInt(scan.nextLine());
			
			if (input_num == 1) {
				System.out.println("------------------------------------------");
				System.out.print("주문할 빵의 개수 : ");
				int cnt = Integer.parseInt(scan.nextLine());
				
				makeBread(cnt);
				
			}//if
			else if (input_num == 2) {
				System.out.println("------------------------------------------");
				System.out.print("주문할 빵의 개수 : ");
				int cnt = Integer.parseInt(scan.nextLine());
				System.out.print("주문할 빵의 종류 : ");
				String name = scan.nextLine();
				
				makeBread(cnt,name);
				
			}//else if
			else if (input_num == 3) {
				System.out.println("------------------------------------------");
				break;
			}//else if
			else {
				System.out.println("잘못된 값을 입력하셨습니다");
			}//else
		}//while
		System.out.println("프로그램을 종료합니다");
	}//order
	
	public static void main(String[] args) {
		
		Example03 bread = new Example03();
		bread.order();

	}//main

}//class

package chapter06;

import java.util.Scanner;

public class Example03 {
	
	Scanner scan = new Scanner(System.in);
	
	int num;
	int breadNum;
	String breadName;
	
	public void breadNum() {
		
		/*
		 String a = "333331ㅇㅇㅇㅇㅇ";
			
			try {
				Integer.parseInt(a);
				System.out.println("a는 숫자입니다");
				
			} catch (Exception e) {
				
				System.out.println("a는 숫자가 아닙니다");
			}
		 */
		
		do {
			
		System.out.print("주문할 빵의 갯수 : ");
		breadNum = Integer.parseInt(scan.nextLine());
		
		if (breadNum>0) {
			
			for (int i=0 ; i<breadNum ; i++) {
				System.out.println((i+1) + "번째 빵을 만들었습니다");
			}//for
		
			System.out.println("요청하신 " + breadNum + "개의 빵이 모두 완성되었습니다" );
		} else {
			System.out.println("잘못된 입력값입니다");
		}
			
			
		} while (breadNum<=0);
		
		
	}//breadNum
	
	public void breadName() {
			
		System.out.print("주문할 빵의 갯수 : ");
		breadNum = Integer.parseInt(scan.nextLine());
		
		
		System.out.print("주문할 빵의 종류 : ");
		breadName = scan.nextLine();
		
		for (int i=0 ; i<breadNum ; i++) {
			System.out.println((i+1) + "번째 " + breadName + " 빵을 만들었습니다");
		}//for
		
		System.out.println("요청하신 " + breadNum + "개의 " + breadName + "빵이 모두 완성되었습니다" );
		
	}
	
	public void order() {
	
	do {
		System.out.println("=========================================");
		System.out.print("1. 빵 갯수 선택 | 2. 빵의 갯수와 종류 | 3. 종료 : ");
		num = Integer.parseInt(scan.nextLine());

		
		Example03 bread = new Example03();
		
		if (num==1) {
			bread.breadNum();
		}//if
		else if (num==2) {
			bread.breadName();	
		}//else if
		else if (num==3) {
				System.out.println("프로그램을 종료합니다");
		}//else if
		else {
			System.out.println("잘못된 값입니다");
		}
	}while (num!=3);

	}//order
	
	public static void main(String[] args) {
		
		Example03 bread = new Example03();
		bread.order();

	}

}

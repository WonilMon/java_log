package chapter09;

import java.util.Scanner;

public class Guide {

	Scanner scan = new Scanner(System.in);
	static String point;
	Guest[] guest;
	int count;
	
	public void init (int num) {
		guest = new Guest [num];
		Scanner scan = new Scanner(System.in);
		point = "오이도";
		System.out.println("-----------------------------------");
		
		for (int i = 0 ; i < guest.length ; i++) {
			count++;
			System.out.println((i+1) + "번째 관광객");
			System.out.print("성함 : ");
			String name = scan.nextLine();
			System.out.print("성별 : ");
			String gender = scan.nextLine();
			System.out.print("전화번호 : ");
			String ssn = scan.nextLine();
			guest[i] = new Guest(name, gender, ssn);
			System.out.println("-----------------------------------");
		}//for
	}//init
	
	public void choice () {
		while(true) {
			System.out.println("1) 관광객 정보 | 2) 목적지변경 | 3) 종료");
			System.out.print("선택 >> ");
			int num = Integer.parseInt(scan.nextLine());
			System.out.println("-----------------------------------");
			
			if(num==1) {
				for(int i = 0 ; i < guest.length ; i++) {
					System.out.println((i+1) + "성함 : " + guest[i].getName());
					System.out.println((i+1) + "성별 : " + guest[i].getGender());
					System.out.println((i+1) + "전화번호 : " + guest[i].getSsn());
					System.out.println((i+1) + "목적지 : " + point);		
					System.out.println("-----------------------------------");
				}
			}else if(num==2) {
				System.out.print("변경할 목적지를 입력해주세요>>");
				point = scan.nextLine();
			}else if(num==3) {
				System.out.println("프로그램을 종료합니다");
				break;
			}else {
				System.out.println("1~3까지의 번호만 입력가능합니다");
			}
			
		}//while
	}
	
}//class



















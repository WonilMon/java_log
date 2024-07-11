package chapter07;

import java.util.Scanner;

public class GuguDanMain {

	public static void main(String[] args) {
		
		GuguDan gd = new GuguDan();
		
		Scanner scan = new Scanner(System.in);
		int num;
		
		System.out.print("출력할 단을 입력하세요 : ");
		num = Integer.parseInt(scan.nextLine());
		
		gd.showTable(num);

	}

}

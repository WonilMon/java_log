package chapter07.Example;

import java.util.Scanner;

public class CanMain {

	public static void main(String[] args) {
		
		String select = "";
		Scanner scan = new Scanner(System.in);
		int money = 0;
		
		Vending ven = new Vending();
		ven.init();
		
		System.out.print("돈을 투입하세요 : ");
		money = Integer.parseInt(scan.nextLine());
		ven.showCans(money);
		
		System.out.println("------------------");
		
		System.out.println("음료를 선택하세요 : ");
		select = scan.nextLine();
		ven.outCan(select);

	}

}

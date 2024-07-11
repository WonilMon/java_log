package chapter07.Example;

import java.util.Scanner;

public class CoffeeGroup {

	Coffee coffee[] = new Coffee[5];
	Scanner scan = new Scanner(System.in);
	
	public CoffeeGroup() {}//생성자
	
	public void inIt() {
		
		for(int i =0 ; i<coffee.length ; i++) {
			
			System.out.print("이름 : ");
			String name = scan.nextLine();
			
			System.out.print("가격 : ");
			int money = Integer.parseInt(scan.nextLine());
			
			coffee[i] = new Coffee(name , money); //오버로딩으로 입력
			
			System.out.println("-------------------------");
			
		}
		
	}//init메서드
	
	public void showList() {
		
		for(int i=0; i<coffee.length; i++) {
			coffee[i].disp();
		}

		
	}//showList
	
}

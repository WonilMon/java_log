package chapter07;

import java.util.Scanner;

public class StartMain {

	public static void main(String[] args) {
		
		int select;
		String check;
		
		Start st = new Start();
		
		while (true) {
		
			System.out.print("숫자를 입력하세요 : ");
			Scanner scan = new Scanner(System.in);
			select = Integer.parseInt(scan.nextLine());
			check = st.check(select);
			
			if(check.equals("SUCCESS")) {
				break;
			} 
			
		}//while 
		
	}//main
	
}//class

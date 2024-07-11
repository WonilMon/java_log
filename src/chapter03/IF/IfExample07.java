package chapter03.IF;

import java.util.Scanner;

public class IfExample07 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		//Scanner : 화면으로부터 데이터를 입력받는 기능을 제공하는 클래스
		
		System.out.print("1. 첫 번째 수 입력 : ");
		double num1 = Double.parseDouble(scan.nextLine());
		System.out.println("첫 번째 입력받은 수 출력 : " + num1);
		System.out.println("-----------------------------");
		
		System.out.print("2. 첫 번째 수 입력 : ");
		double num2 = Double.parseDouble(scan.nextLine());
		System.out.println("두 번째 입력받은 수 출력 : " + num2);
		System.out.println("-----------------------------");
		
		if (num2 == 0.0) {
			System.out.println("0으로는 나눌 수 없습니다");
		} else { 
			System.out.println("나눈 값 : " + num1/num2);
		}
		

	}

}

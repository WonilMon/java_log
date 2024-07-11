package chapter21.Example;

import java.util.Scanner;

public class LambdaTest {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Calculator cal;
		
		while(true) {
			System.out.print("첫번째 숫자를 입력하세요 : ");
			int number1 = Integer.parseInt(scan.nextLine());
			System.out.print("두번째 숫자를 입력하세요 : ");
			int number2 = Integer.parseInt(scan.nextLine());
			System.out.println("수행할 연산을 선택하세요 (1 : 더하기, 2 : 빼기, 3 : 곱하기, 4 : 나누기, 5: 종료");
			int select = Integer.parseInt(scan.nextLine());
			
			if (select == 1) {
				cal = (num1, num2) -> number1 + number2;
				System.out.println(cal.calculate(number1, number2));
			}else if(select == 2) {
				cal = (num1, num2) -> number1 - number2;
				System.out.println(cal.calculate(number1, number2));
			}else if(select == 3) {
				cal = (num1, num2) -> number1 * number2;
				System.out.println(cal.calculate(number1, number2));
			}else if(select == 4) {
				cal = (num1, num2) -> number1 / number2;
				System.out.println(cal.calculate(number1, number2));
			}else if(select == 5) {
				System.out.println("프로그램 종료");
				break;
			}
		}
	}

}

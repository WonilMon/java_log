package chapter03.FOR;

import java.util.Scanner;

public class ForTest07 {

	public static void main(String[] args) {
		
		//10개의 정수를 입력받아 3의 배수와 5의 배수를 각각 몇 개씩 받았는지 출력하시오
		Scanner scan = new Scanner(System.in);
		int a, cnt3=0, cnt5=0;
		
		for (a=1; a<=10; a++) {
			System.out.print(a + "번째 정수를 입력하세요 : ");
			int i = Integer.parseInt(scan.nextLine());
			if (i%3==0) {
				cnt3++;
			} else if (i%5==0) {
				cnt5++;
			}
		}
		
		System.out.println("3의 배수 : " + cnt3);
		System.out.println("5의 배수 : " + cnt5);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

package chapter09;

import java.util.Scanner;

public class Tour {
	
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		Guide g = new Guide();
		
		System.out.print("관광객 수를 입력 : ");
		int num = Integer.parseInt(scan.nextLine());
		g.init(num);
		g.choice();
		
		
	}//main
	
}//class


/*
1. 관광객 수를 입력
2. 수에 맞게 방문자 성함/성별/전화번호 순서대로 입력
3. 1)관광객정보 2)목적지변경 3)종료 (반복창)
4. 1을 누를 시 입력한 관광객 정보와 목적지(기본값 : 오이도)를 출력
5. 2를 누를 시 "목적지를 변경하시겠습니까" 라는 문구, 값입력시 변경 
6. 종료를 누를 시 반복문 종료
*/

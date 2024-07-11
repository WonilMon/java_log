package chapter03.IF;

import javax.swing.JOptionPane;

public class IfExample05 {

	public static void main(String[] args) {
		
		//미취학 아동(7세 미만)의 전시관의 입장료는 1000원
		//초등학생(8~13세)의 전시관의 입장료는 2000원
		//중고등학생(14~19세)의 전시관의 입장료는 3500원
		//성인의 전시관의 입장료는 5000원
		
		String a;
		int age = Integer.parseInt(JOptionPane.showInputDialog("나이를 입력하시오"));
		
		if (age>=0 && age<7) {
			a = "미취학아동";
			System.out.println(a + "입니다");
			System.out.println("입장료는 1000원입니다");
		} else if (age>=7 && age<14) {
			a = "초등학생";
			System.out.println(a + "입니다");
			System.out.println("입장료는 2000원입니다");
		} else if (age>=14 && age<20) {
			a = "중고등학생";
			System.out.println(a + "입니다");
			System.out.println("입장료는 3500원입니다");
		} else {
			a = "성인";
			System.out.println(a + "입니다");
			System.out.println("입장료는 5000원입니다");
		}
		
		
		
		
		
		
		
		
		
		

	}

}

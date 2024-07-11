package chapter03.WHILE;

import javax.swing.JOptionPane;

public class WhileTest06 {

	public static void main(String[] args) {
		
		int num1, num2;
		
		do {
			
			num1 = Integer.parseInt(JOptionPane.showInputDialog("OTP DB"));
			num2 = Integer.parseInt(JOptionPane.showInputDialog("OTP USER"));
			
			if (num1 == num2) {
				break;
			} else {
				System.out.println("다시 입력하세요 !!!");	
			}
			
		} while (num1!=num2);
		
		System.out.println("입력성공");
		
		
		
		

	}

}

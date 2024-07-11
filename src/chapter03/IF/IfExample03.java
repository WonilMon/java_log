package chapter03.IF;

import javax.swing.JOptionPane;

public class IfExample03 {

	public static void main(String[] args) {
		
		char grade;
		int jumsu;
		
		jumsu = Integer.parseInt(JOptionPane.showInputDialog("Java 점수"));
		
		if (jumsu >= 90) {
			grade = '합';
			System.out.println('A');
			System.out.println(grade);
		} else if (jumsu >= 80) {
			grade = '합';
			System.out.println('B');
			System.out.println(grade);
		} else if (jumsu >= 70) {
			grade = '불';
			System.out.println('C');
			System.out.println(grade);
		} else if (jumsu >= 60) {
			grade = '불';
			System.out.println('D');
			System.out.println(grade);
		} else {
			grade = '불';
			System.out.println('F');
			System.out.println(grade);
		}
		
	}

}

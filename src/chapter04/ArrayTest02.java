package chapter04;

import javax.swing.JOptionPane;

public class ArrayTest02 {

	public static void main(String[] args) {
		
		String student [] = new String [3];
		String phone [] = new String [student.length];
		
		for(int i=0; i<student.length; i++) {
			student[i] = JOptionPane.showInputDialog("이름");
			phone[i] = JOptionPane.showInputDialog("전화번호");
			
			System.out.println("이름 : " + student[i] + " | 전화번호 : " + phone[i]);
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

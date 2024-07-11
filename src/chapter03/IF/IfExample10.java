package chapter03.IF;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class IfExample10 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("아이디 : ");
		String ID = scan.nextLine();
		
		System.out.print("비밀번호 : ");
		int PW = Integer.parseInt(scan.nextLine());
		
		if (ID.equals("soldesk")) {
			if (PW == 12345) {
				System.out.println("로그인 성공");
			} else {
				System.out.println("로그인 실패");
			}
		} else {
			System.out.println("로그인 실패");
		}
		
		
		
		
		
		
		
		

	}

}

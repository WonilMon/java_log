package chapter04;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class TwoDimension02_Test {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int javaScore [] [] = new int [2][3];
	
		for (int i = 0; i < javaScore.length; i++) {
			
			for (int j = 0; j < javaScore[i].length; j++) {
				
				System.out.print("점수 입력하셈 -> ");
				javaScore[i][j] = Integer.parseInt(scan.nextLine());
				System.out.println("JavaScore[" + i + "][" + j + "] : " + javaScore[i][j]);
				
			}
			
			System.out.println();
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

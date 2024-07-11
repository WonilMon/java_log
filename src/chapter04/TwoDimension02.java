package chapter04;

import javax.swing.JOptionPane;

public class TwoDimension02 {

	public static void main(String[] args) {
		
		int javaScore [] [] = new int [3][4];
		int scoreSum = 0;
		
		for (int i = 0; i < javaScore.length; i++) {
			
			for (int j = 0; j < javaScore[i].length; j++) {
				
				javaScore[i][j] = Integer.parseInt(JOptionPane.showInputDialog("점 수"));
				System.out.println("JavaScore[" + (i+1) + "-" + (j+1) + "] : " + javaScore[i][j]);
				scoreSum += javaScore[i][j];
			}
			System.out.println((i+1) + "회차 총 점 : " + scoreSum);
			System.out.println();
			scoreSum = 0;
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

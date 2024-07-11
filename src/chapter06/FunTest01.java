package chapter06;

import javax.swing.JOptionPane;

public class FunTest01 {

	public static void sum(int num1, int num2) {
		
		int total = num1 + num2;
		System.out.println(total);
		
	}
	
	public static int sum1(int num1, int num2) {
		
		int total = num1 + num2;
		return total;
		
	}
	
	public static void main(String[] args) {
		
		int a,b;
		a = Integer.parseInt(JOptionPane.showInputDialog("값1"));
		b = Integer.parseInt(JOptionPane.showInputDialog("값2"));
		
		sum(a,b);
		
		int c=1;
		int d=2;
		
		sum(c,d);
		sum(3,4);
		
		System.out.println("---------------------");
		
		int e = 5;
		int f = 6;
		int g = sum1(e,f);

		System.out.println(g);
		
	} //main

}

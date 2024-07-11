package chapter07;

import javax.swing.JOptionPane;

public class SungJuk {

	//멤버변수(상태값)
	private String std_num;
	private String std_name;
	private int java, oracle, spring;
	
	//디폴트 생성자(생략가능) : 객체를 생성할 때 호출하는 메서드
	public SungJuk() {
		
	}
	
	//메서드
	public void sum() {
		int total = java + oracle + spring;
		System.out.println("총합계 : " + total);
	}
	
	public void avg() {
		int avg = (java + oracle + spring)/3;
		System.out.println("평균 : " + avg);
	}
	
	
	public static void main(String[] args) {
		
		SungJuk rec = new SungJuk();
		//참조변수 : '설계도를 받아 제품을 만든다라는 의미'
		//'new SungJuk'의 'SungJuk'이 생성자
		rec.std_num = JOptionPane.showInputDialog("학번");
		rec.std_name = JOptionPane.showInputDialog("이름");
		
		rec.java = Integer.parseInt(JOptionPane.showInputDialog("자바 점수"));
		rec.oracle = Integer.parseInt(JOptionPane.showInputDialog("오라클 점수"));
		rec.spring = Integer.parseInt(JOptionPane.showInputDialog("스프링 점수"));
		
		System.out.println("학번 : " + rec.std_num + " | " + "이름 : " + rec.std_name + "님의 성적입니다");
		rec.sum();
		rec.avg();

	}//main

}//class

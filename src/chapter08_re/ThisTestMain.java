package chapter08_re;

import javax.swing.JOptionPane;

public class ThisTestMain {

	public static void main(String[] args) {
		
		//1번방법
		
		int rSpeed = Integer.parseInt(JOptionPane.showInputDialog("로봇속도"));
		int rAge = Integer.parseInt(JOptionPane.showInputDialog("로봇나이"));
		String rName = JOptionPane.showInputDialog("로봇이름");
		String rNum = JOptionPane.showInputDialog("로봇번호");
		
		ThisTest r1 = new ThisTest(rSpeed, rAge, rName, rNum);
		
		/*
		 
		2번방법
		r1.setSpeed(Integer.parseInt(JOptionPane.showInputDialog("로봇 속도")));
		r1.setAge(Integer.parseInt(JOptionPane.showInputDialog("로봇 나이")));
		r1.setRobotName(JOptionPane.showInputDialog("로봇 이름"));
		r1.setRobotNum(JOptionPane.showInputDialog("로봇 번호"));
		
		//
		
		3번방법
		r1.jop();
		
		*/
		System.out.println("속도 : " + r1.getSpeed());
		System.out.println("나이 : " + r1.getAge());
		System.out.println("이름 : " + r1.getRobotName());
		System.out.println("번호 : " + r1.getRobotNum());
		
		System.out.println("----------------------------");
		
		r1.move(); //속도 20+
		r1.rName(); //생성자 주입 이름
		r1.rAge(); //생성자 주입 나이
		r1.move();
		r1.move();
		r1.move();
		r1.stop(); //속도값 0
		
		

	}

}

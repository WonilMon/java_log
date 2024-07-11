package chapter08_re;

import javax.swing.JOptionPane;

public class ThisTest {

	private int speed;
	private int age;
	private String robotName;
	private String robotNum;
	
	public ThisTest(int speed, int age, String name, String num) {
		this.speed = speed;
		this.age = age;
		this.robotName = name;
		this.robotNum = num;
	}
	
	/*
	 
	3번방법
	public void jop() {
		speed = Integer.parseInt(JOptionPane.showInputDialog("로봇 속도"));
		age = Integer.parseInt(JOptionPane.showInputDialog("로봇 나이"));
		robotName = JOptionPane.showInputDialog("로봇 이름");
		robotNum = JOptionPane.showInputDialog("로봇 번호");
	}
	
	*/
	
	public void move() {
		speed += 20;
		System.out.println("RobotSpeed : " + speed);
	}
	
	public void rName() {
		System.out.println("RobotName : " + robotName);
	}
	
	public void rAge() {
		System.out.println("RobotAge : " + age);
	}
	
	public void stop() {
		speed = 0;
		System.out.println("RobotSpeed : " + speed);
	}

	
	
	//----------------------------------------------
	
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getRobotName() {
		return robotName;
	}

	public void setRobotName(String robotName) {
		this.robotName = robotName;
	}

	public String getRobotNum() {
		return robotNum;
	}

	public void setRobotNum(String robotNum) {
		this.robotNum = robotNum;
	}
	
	//----------------------------------------------
	
}

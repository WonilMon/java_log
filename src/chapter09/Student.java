package chapter09;

public class Student {
	
	public static int serialNum = 9999;
	
	String name;
	int studentID; 
	/*
	public Student(String name, int studentID) {
		this.name = name;
		this.studentID = studentID;
	}
	*/
	
	public Student(String name) {
		serialNum++;
		this.studentID = serialNum;
		this.name = name;
	}
	
	public void print () {
		
		//System.out.println("이름 : " + name + " | 아이디 : " + (serialNum + studentID));
		System.out.println("이름 : " + name + " | 아이디 : " + studentID);
	}
	
}

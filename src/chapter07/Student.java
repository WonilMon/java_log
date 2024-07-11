package chapter07;

import javax.swing.JOptionPane;

public class Student {
	
	//멤버변수(필드)
	private int studentId;
	private String studentName;
	private int grade;
	private String address;
	
	//디폴트 생성자
	public Student() {}
	//생성자 오버로딩
	public Student(String studentName, String address) { //지역변수의 이름과 멤버변수의 이름이 같으면 this 함수 사용
		this.studentName = studentName;
		this.address = address;
	}
	
	//메서드
	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	
	public void showStudentInfo() {
		System.out.println(studentName + ", " + address);
		
	}
}

	
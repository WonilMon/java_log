package chapter07;

public class StudentInfoMain {

	public static void main(String[] args) {
		
		StudentInfo studentKim = new StudentInfo();
		
		studentKim.setStudentId(1000);
		studentKim.setStudentName("홍길동");
		studentKim.setAddress("서울시 종로구");
		studentKim.setGrade(3);
			
		System.out.println(studentKim.getStudentId() + " | " + studentKim.getStudentName());
		studentKim.disp();
		
		System.out.println("----------------------------");
		
		StudentInfo studentLee = new StudentInfo();
		
		studentLee.setStudentId(1001);
		studentLee.setStudentName("이순신");
		studentLee.setAddress("서울시 성북구");
		studentLee.setGrade(2);
			
		System.out.println(studentLee.getStudentId() + " | " + studentLee.getStudentName());
		studentLee.disp();
		
		System.out.println("----------------------------");
		
	}//main

}//class

package chapter07;

public class StudentMain {

	public static void main(String[] args) {
		
		Student student1 = new Student(); 
		student1.setStudentName("김치");
		student1.setAddress("서울시 종로구");
		student1.showStudentInfo();
		
		System.out.println("---------------------------");
		
		Student student2 = new Student();
		student2.setStudentName("박수");
		student2.setAddress("경기도 고양시");
		student2.showStudentInfo();
		
		System.out.println("---------------------------");
		
		Student student3 = new Student("이유", "서울시 은평구");
		student3.showStudentInfo();
		
	}

}

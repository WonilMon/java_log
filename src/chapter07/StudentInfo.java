package chapter07;

public class StudentInfo {

		//필드
		private int studentId;
		private String studentName;
		private int grade;
		private String address;
		
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
		
		
		public void disp() {
			System.out.println(address + " | "  + grade);
			
		}
		
		
}

package chapter22.Example;

public class Student {
	
	private static int num = 1000;
	private String name;
	private String department;
	private int stdNum;
	private int grade;
	private int age;

	public Student (String name,String department, int grade, int age) {
		stdNum = num;
		num++;
		this.name = name;
		this.department = department;
		this.grade = grade;
		this.age = age;
	}

	@Override
	public String toString() {
		return num + "\t" + department + "\t" + stdNum + "학년" + "\t" + name + "\t" + "나이 : " + age;
	}

	public static int getNum() {
		return num;
	}

	public static void setNum(int num) {
		Student.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getStdNum() {
		return stdNum;
	}

	public void setStdNum(int stdNum) {
		this.stdNum = stdNum;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
	
}

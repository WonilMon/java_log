package chapter17_Generic.Example;

public abstract class Human {
	
	String name;
	String age;
	
	public Human(String name, String age) {
		this.name = name;
		this.age = age;
	}
	
	public abstract void act();

	@Override
	public String toString() {
		return "Human [name=" + name + ", age=" + age + "]";
	}
	
}

//=========================================================

class Student extends Human {
	
	private String grade;
	
	public Student(String name, String age, String grade) {
		super(name, age);
		this.grade = grade;
	}
	
	@Override
	public void act() {
		System.out.println(grade + " 학생 " + name + "가(이) 공부를 합니다.");
	}
	
}

//=========================================================

class Professor extends Human {
	
	private String subject;
	
	public Professor(String name, String age, String subject) {
		super(name, age);
		this.subject = subject;
	}
	
	@Override
	public void act() {
		System.out.println(subject + " 교수 " + name + "가(이) 강의를 합니다.");
	}
	
}

//=========================================================




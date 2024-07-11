package chapter19.Example;

public class Student implements Comparable<Student>{
	
	private int sno;
	private String name;
	
	public Student(int sno, String name) {
		this.sno = sno;
		this.name = name;
	}

	@Override
	public String toString() {
		return "ID " + sno + " 학생 " + name + " 님의 점수 : ";
	}

	@Override
	public int compareTo(Student o) {
		return (this.sno - o.sno);    // 숫자를 비교할 때는 - 사용
	}

	public int getSno() {
		return sno;
	}
	
}

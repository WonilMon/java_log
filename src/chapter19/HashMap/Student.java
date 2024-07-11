package chapter19.HashMap;

import java.util.Objects;

public class Student {
	
	int sno;
	String name;
	
	public Student (int sno, String name) {
		this.name = name;
		this.sno = sno;
	}

	@Override
	public String toString() {
		return "학번 : " + sno + "번, 이름 : " + name + "님의 점수";
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, sno);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(name, other.name) && sno == other.sno;
	}

	
}

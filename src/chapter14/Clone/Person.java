package chapter14.Clone;

import java.util.Objects;

public class Person implements Cloneable{ 
	
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
//-------------------------------------------------------------------
	@Override
	public String toString() {
		return  "Person {name= '" + name + "', age=" + age + "}";
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return age == other.age && Objects.equals(name, other.name);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
//-------------------------------------------------------------------
}


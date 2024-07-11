package chapter22;

import java.util.Objects;

public class Member {
	
	 private String name;
	 private String gender;
	 private int age;
	 private String residence;
	   
	 public Member(String name, String gender, int age, String residence) {
		 this.name = name;
		 this.gender = gender;
		 this.age = age;
		 this.residence = residence;
	 }
	 public String getName() {
		 return name;
	 }
	 public void setName(String name) {
		 this.name = name;
	 }
	 public String getGender() {
		 return gender;
	 }
	 public void setGender(String gender) {
		 this.gender = gender;
	 }
	 @Override
	public int hashCode() {
		return Objects.hash(name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Member other = (Member) obj;
		return Objects.equals(name, other.name);
	}
	public int getAge() {
		 return age;
	 }
	 public void setAge(int age) {
		 this.age = age;
	 }
	 public String getResidence() {
		 return residence;
	 }
	 public void setResidence(String residence) {
		 this.residence = residence;
	 }
	 @Override
	 public String toString() {
		 return "Member [name=" + name + ", gender=" + gender + ", age=" + age + ", residence=" + residence + "]";
	 }
	 
}

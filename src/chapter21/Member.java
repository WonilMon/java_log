package chapter21;

public class Member {
	
	private String name;
	private String gender;
	private String residence;
	private int age;

	public Member(String name, String gender, int age, String residence) {
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.residence = residence;
	}

	@Override
	public String toString() {
		return "Member [name=" + name + ", gender=" + gender + ", residence=" + residence + ", age=" + age + "]";
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getResidence() {
		return residence;
	}

	public void setResidence(String residence) {
		this.residence = residence;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName () {
		return name;
	}

	
}

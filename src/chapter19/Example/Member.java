package chapter19.Example;

import java.util.Objects;

public class Member {
	
	private int id;
	private String name;
	
	public Member(int id, String name) {
		this.id = id;
		this.name = name;
	}

	//-----------------------------------
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	//-----------------------------------

	@Override
	public String toString() {
		return name + "회원님의 아이디는 " + id + "입니다.";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
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
		return id == other.id;
	}
	
}

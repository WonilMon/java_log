package chapter14.HashCode;

import java.util.Objects;

public class Dog {
	
	private String sort;
	private String name;
	
	public Dog (String sort, String name) {
		this.sort = sort;
		this.name = name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, sort);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dog other = (Dog) obj;
		return Objects.equals(name, other.name) && Objects.equals(sort, other.sort);
	}
	
}

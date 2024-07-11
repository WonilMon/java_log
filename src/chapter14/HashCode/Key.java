package chapter14.HashCode;

import java.util.Objects;

public class Key {
	
	public int number;
	public int name;
	public int addr;
	
	public Key (int number) {
		this.number = number;
	}
	
//-----------------------------------------
	/*
	@Override
	public int hashCode() {
		return Objects.hash(number);
	}*/

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Key other = (Key) obj;
		return number == other.number;
	}
	//number 만 가져왔으니, number 라는 값만 같으면 같다고 인식을 하겠죠
//-----------------------------------------
}

package chapter14.Equals;

import java.util.Objects;

public class Member01 {
	
	private String id;
	
	public Member01 (String id) {
		this.id = id;
	}
	
}

//----------------------------------------

class Member02 {
	private String id;
	
	public Member02(String id) {
		this.id = id;
	}
	
	/*
	//1
	@Override
	public boolean equals(Object obj) { //equals 객체를 담아서 보냄 (equals 는 객체를 필요로함)
		Member02 user = (Member02)obj; //Object 에는 id 변수가 없으므로 다운캐스팅
		boolean result = id.equals(user.id);
		
		return result;
	}
	*/
	
	//2
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Member02 other = (Member02) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
}

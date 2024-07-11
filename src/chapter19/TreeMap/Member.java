package chapter19.TreeMap;

public class Member implements Comparable<Member> {
	
	private int id;
	private String name;
	
	public Member(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Member o) {	//정렬하는 것만 잡아주면 HashMap 이랑 다 똑같다
		
		//return (this.name.compareTo(o.name));		
		return (this.id - o.id);
		
	}
	
	// Tree 는 String 이나 int 의 순서만 잡아줘서 객체가 들어가 Map 은 정렬 안 됨 
	// 따라서 Comparator 상속을 해줘서 넣어줘야되는데
	// 그냥 객체인 Member 변수에 Comparable 넣어줘도됨
	// => 1001 중복값 x , id 기준 정렬
	
}

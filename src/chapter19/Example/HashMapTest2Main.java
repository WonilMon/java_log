package chapter19.Example;

public class HashMapTest2Main {

	public static void main(String[] args) {
		
		HashMapTest2 memberMap = new HashMapTest2();
		Member memberYim = new Member(1001, "임승연");
		Member memberKim = new Member(1002, "김연희");
		Member memberChoi = new Member(1003, "최재호");
		Member memberNo = new Member(1004, "노승찬");
		
		memberMap.addMember(memberYim);
		memberMap.addMember(memberKim);
		memberMap.addMember(memberChoi);
		memberMap.addMember(memberNo);
		
		memberMap.showAllMember();
		
		System.out.println();
		memberMap.removeMember(1003);
		
		memberMap.showAllMember();
		
		
	}//main

}//class

package chapter18.Example;

import java.util.HashSet;

import chapter18.Member;

public class HashSetTestMain {

	public static void main(String[] args) {
		
		HashSetTest memberSet = new HashSetTest();
		
		Member memberLee = new Member(1001, "김씨");
		Member memberSon = new Member(1002, "손씨");
		Member memberPark = new Member(1003, "박씨");
		Member memberHong = new Member(1004, "홍씨");
		
		memberSet.addMember(memberLee);
		memberSet.addMember(memberSon);
		memberSet.addMember(memberPark);
		memberSet.addMember(memberHong);
		
		memberSet.showAllMember();
		
		memberSet.addMember(new Member(1003, "정씨")); 		// chapter18의 Member 의 hashCode & equals 로 중복값 안들어가게
		memberSet.removeMember(1001);
		System.out.println();
		
		memberSet.showAllMember();
		
	}

}

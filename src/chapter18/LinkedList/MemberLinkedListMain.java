package chapter18.LinkedList;

import chapter18.Member;

public class MemberLinkedListMain {

public static void main(String[] args) {
		
		MemberLinkedList ml = new MemberLinkedList();	// 1. 객체로 만든 순간에
		
		Member Kim = new Member(1000, "김씨");
		Member Lee = new Member(1001, "이씨");
		Member Park = new Member(1002, "박씨");
		Member Hong = new Member(1003, "홍씨");			// 3. 주소값을 담은 객체를
		Member Hongg = new Member(1003, "홍씨");	
		
		ml.addMember(Kim);		
		ml.addMember(Lee);
		ml.addMember(Park);
		ml.addMember(Hong);		
		ml.addMember(Hongg);	//중복 허용 순서대로 저장		// 4. list 에 객체 째로 저장
		
		ml.showAllMember();								// 5. 멤버 클래스를 toString 처리 안하면 주소만뜸
		
		ml.removeMember(1001);
		
		System.out.println();
		
		ml.showAllMember();	
	}

}

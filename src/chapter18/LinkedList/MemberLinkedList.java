package chapter18.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

import chapter18.Member;

public class MemberLinkedList {
	
	private LinkedList<Member> list;
	
	public MemberLinkedList() {							// 2. 이 생성자가 작동이 되겠죠 
		list = new LinkedList<Member>();
	}
	
	public void addMember (Member member) {				// LinkedList 에 들어온 객체를 하나씩 쌓기
		list.add(member); 
	}
	
	public void showAllMember () {
		for(Member member : list) {
			System.out.println(member); 				
		}
	}
	
	public boolean removeMember (int id) {
		Iterator<Member> it = list.iterator();
		
		while(it.hasNext()) {
			Member m = it.next(); 						// 6. 깡통만들어서 하나씩 담아서 조건문 판단
			if(id==m.getId()) {
				it.remove();
				return true;
			}
		}
		System.out.println(id + "가 존재하지않습니다");
		return false;
	}

}

//=========================================================================================
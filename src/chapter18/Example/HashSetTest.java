package chapter18.Example;

import java.util.HashSet;
import java.util.Iterator;

import chapter18.Member;

public class HashSetTest {
	
	HashSet<Member> memberSet; 
	
	public HashSetTest () {
		memberSet = new HashSet<Member>();
	}
	
	public void addMember (Member member) {
		memberSet.add(member);
	}
	
	public void showAllMember () {
		for(Member m : memberSet) {
			System.out.println(m);
		}
	}
	
	public boolean removeMember (int id) {
		Iterator<Member> it = memberSet.iterator();
		while(it.hasNext()) {
			Member m = it.next();
			if(id == m.getId()) {
				memberSet.remove(m);
				return true;
			}
		}
		System.out.println(id + "가 존재하지 않습니다");
		return false;
	}
	
}

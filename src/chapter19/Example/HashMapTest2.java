package chapter19.Example;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest2 {
	
	Map<Integer, String> map;
	
	public HashMapTest2 () {
		 map = new HashMap<Integer, String>();
	}
	
	public void addMember (Member member) {
		map.put(member.getId(),member.getName());
	}
	
	//-------------------------<내가 짠 코드>-------------------------
	
	public void showAllMember () {
		Collection<String> set = map.values();
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			String name = it.next();
			System.out.println(name);
		}
	}
	
	public boolean removeMember (int memberId) {
		
		Set<Integer> set = map.keySet();
		Iterator<Integer> it = set.iterator();
		while(it.hasNext()) {
			int no = it.next();
			if(memberId==no) {
				map.remove(no);
				return true;
			}
		}
		return false;
	}
	
	//-------------------------<강사님이 짜신 코드>-------------------------
	
	public void showAllMember2 () {
		Set<Integer> set = map.keySet();
		Iterator<Integer> it = set.iterator();
		while(it.hasNext()) {
			int key = it.next();
			String value = map.get(key);
			System.out.println(value);
		}
	}
	
	public boolean removeMember2 (int memberId) { 
		
		while(map.containsKey(memberId)) {
			map.remove(memberId);
			return true;
		}
		System.out.println("id가 존재하지 않습니다");
		return false;
		
	}
	
}//class


package chapter19.TreeMap;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;



public class TreeMapTest {
	
	public static void main(String[] args) {
		
		// TreeMap = 순서를 보장해주는 HashMap
		Map<Member, Integer> memberTreeMap = new TreeMap<Member, Integer>();
		
		Member member1 = new Member(1000, "손씨");
		Member member2 = new Member(1002, "전씨");
		Member member3 = new Member(1004, "장씨");
		Member member4 = new Member(1001, "권씨");
		Member member5 = new Member(1001, "권씨");
		
		memberTreeMap.put(member1, 95);
		memberTreeMap.put(member2, 85);
		memberTreeMap.put(member3, 95);
		memberTreeMap.put(member4, 75);
		memberTreeMap.put(member5, 75);
		
		Set<Map.Entry<Member, Integer>> entrySet = memberTreeMap.entrySet();
		Iterator<Map.Entry<Member, Integer>> entryIt = entrySet.iterator();
		while(entryIt.hasNext()) {
			Map.Entry<Member, Integer> m = entryIt.next();
			Member key = m.getKey();
			Integer value = m.getValue();
			System.out.println(key + " " + value);
			
			// Tree 는 String 이나 int 의 순서만 잡아줘서 객체가 들어가 Map 은 정렬 안 됨 
			// 따라서 Comparator 상속을 해줘서 넣어줘야되는데
			// 그냥 객체인 Member 변수에 Comparable 넣어줘도됨
			// => 1001 중복값 x , id 기준 정렬
			
			
		}
	}
	
}

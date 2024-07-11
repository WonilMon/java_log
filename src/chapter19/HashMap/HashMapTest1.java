package chapter19.HashMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest1 {
	
	public static void main(String[] args) {
		
		//	  Key ,  Value
		Map<String, Integer> map = new HashMap<String, Integer>();
		//	  ID 와 회원정보라고 생각하면 편함. (ID는 중복X / 회원정보는 중복O)
		//	  Map 은 HashSet 으로 구성되어있음
		
		map.put("Java", 85);						// add 대신 put
		map.put("Oracle", 85);
		map.put("JSP", 90);
		map.put("Spring", 75);
		
		// 각각의 요소를 Entry 라고 부름
		System.out.println("총 Entry 수 : " + map.size());
		System.out.println("Java의 Value : " + map.get("Java")); // Key 를 통해 Value 불러오기
		
		map.put("Java", 95);
		System.out.println("총 Entry 수 : " + map.size());
		System.out.println("Java의 Value : " + map.get("Java")); // 같은 Key 로 저장 시 Value 교체
		
		System.out.println("------------------------------------------");
		
		boolean containKey = map.containsKey("HTML"); 	// Key 값이 안에 있으면 True 를 반환
		System.out.println(containKey);
		if(! containKey) {
			map.put("HTML", 100);
		}
		
		map.putIfAbsent("CSS", 99); 				//위 과정을 그냥 한줄로
		map.putIfAbsent("Java", 90);
		
		
		System.out.println("------------------------------------------");
		
		//Key 는 Set 으로 구성
		Set<String> keySet = map.keySet(); 			// Set 은 중복을 허용하지 않는 집합
		Collection<Integer> values = map.values();	// Collection 은 객체들의 집합
		
		
		
		for(String k : keySet) {
			System.out.print(k + "\t");
		}
		
		System.out.println();
		
		for(Integer v : values) {
			System.out.print(v + "\t");
		}
		
		System.out.println();
		System.out.println();
		
		Iterator<String> it = keySet.iterator();
		while(it.hasNext()) {
			String key = it.next();
			Integer value = map.get(key);
			System.out.println(key + "\t" + value);
		}
		
		System.out.println("------------------------------------------");
		
		// 이걸 많이 쓰게 될 거에요 (위에꺼 보다 이걸 외우셈)
		// Map 이 가지고 있는 Key 값, Value 값 통째로 Set 으로 들어감
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		
		// Set 을 꺼내오는 법, Iterator 를 통해
		Iterator<Map.Entry<String, Integer>> entryIT = entrySet.iterator();
		while(entryIT.hasNext()) {
			//위 처럼 Key, Value 하나씩 담는게 아니라 Map 자체를 담으셈
			Map.Entry<String, Integer> entry = entryIT.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println(key + "\t" + value);
		}
		
		
		map.clear(); // 전체삭제
		System.out.println("총 Entry 수 : " + map.size());
		
		
		
	}//main
	
}//class

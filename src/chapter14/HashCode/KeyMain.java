package chapter14.HashCode;

import java.util.HashMap;

public class KeyMain {

	public static void main(String[] args) {
		
		HashMap<Key, String> hashMap = new HashMap<Key, String>();
		//HashMap<int, int> hasMap = new HashMap<Key, String>();
		//HashMap<Integer, Integer> hasMap = new HashMap<Key, String>();
		
		//중복된 값을 저장하지 않는 컬렉션
		hashMap.put(new Key(1), "홍길동");
		System.out.println(hashMap);
		hashMap.put(new Key(1), "홍길동");
		System.out.println(hashMap);
	}
	//number 만 가져왔으니, number 라는 값만 같으면 같다고 인식을 하겠죠
}

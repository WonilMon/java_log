package chapter19.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapTest2 {

	public static void main(String[] args) {
		
		// 사실 Map 은 이런 로그인으로 쓸 건 아니고, 나중에 J son 이라는 것을 할 때 씀 
		// 							  HashTable 도 있는데 똑같음 걍 
		Map<String, String> map = new HashMap<String, String>();
		Scanner scan = new Scanner(System.in);
		
		map.put("Spring", "123");
		map.put("Summer", "1234");
		map.put("Fail", "12345");
		map.put("Winter", "123456");
		
		while(true) {
			System.out.println("----------------------");
			System.out.println("아이디와 비밀번호를 입력하세요");
			System.out.print("아이디 : " );
			String id = scan.nextLine();
			
			if(map.containsKey(id)) {					// 해당하는 아이디가 key 에 있으면 !
				System.out.print("비밀번호 : " );		
				String pw = scan.nextLine();
				if(map.get(id).equals(pw)) {			// Key(id)를 이용해 Value(p w)를 불러오고 그게 입력한 p w 와 같으면 !
					System.out.println("로그인성공");
					break;
				}else {
					System.out.println("비밀번호가 일치하지 않습니다");
					continue;							// while 문을 다시 수행을 할게요
				}
			}else {
				System.out.println("아이디가 일치하지 않습니다");
				continue;
			}
			
		}//while

	}//main

}//class

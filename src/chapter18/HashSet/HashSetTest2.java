package chapter18.HashSet;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetTest2 {
	
	public static void main(String[] args) {
		
		HashSet<Integer> hs = new HashSet<Integer>();
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		while(true) {
			int i = (int) (Math.random()*45+1);
			hs.add(i);
			al.add(i);
			
			if(hs.size() >= 6) {
				break;
			}
		}//while
		
		System.out.println(hs);				// HashSet 은 중복값이 나오지 않으므로 같은 수가 안나옴 
		System.out.println(al);				// ArrayList 는 중복되더라도 노상관
		
		// 맹점
		// 예시에서 넣은 Integer 나 String 은 똑같은 값을 같은 객체로 판단, 
		// 그러나 이름, 나이 등 여러 정보가 들어있는 객체가 같은지는 판단 못함
		// 그래서 같게 인식하게끔 수정해줘야함 (hashCode & equals 재정의 통해)
		// 이름, 나이 등 같게 인식할 부분만 체크해준 뒤 재정의 ㅇㅇ
		// **ArrayList 의 'Person'클래스에 작용하면 같은 이름 등록 무효화 가능**
	}
	
}

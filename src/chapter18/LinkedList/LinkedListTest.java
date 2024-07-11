package chapter18.LinkedList;

import java.util.LinkedList;

public class LinkedListTest {
	
	//특정 인덱스에서 객체를 제거하거나 추가하면 바로 앞뒤 링크로 연결
	//빈번한 객체 삽입, 삭제가 일어나는 곳에서는 ArrayList 보다 성능이 좋음
	
	public static void main(String[] args) {
		
		LinkedList<String> list = new LinkedList<String>();
		list.add("C");
		list.add("D");
		list.add("E");
		System.out.println(list);
		
		list.add(0, "B");
		System.out.println(list);
		
		list.addFirst("A");
		System.out.println(list);
		
		list.addLast("F");
		System.out.println(list);
		
		list.add("G");
		System.out.println(list);
		
		
		list.removeLast();
		System.out.println(list);
		
	}

}

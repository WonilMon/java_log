package chapter18.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest01 {
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(100);
		list.add(20);
		list.add(30);
		
		//for 문 ==> 읽기전용
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		for(Integer i : list) {
			System.out.println(i);
		}
		
		/*
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
			list.remove(i);
		}
		for(Integer i : list) {
			System.out.println(i);
			list.remove(i);
		}
		*/ //오류뜸
		
		System.out.println("====================================");
		
		//반복자
		Iterator<Integer> it = list.iterator(); //객체 뽑아서
		while(it.hasNext()) { //하나씩 뽑아 순회하면서 마지막에 빠져나오는 문
			Integer i = it.next();
			System.out.println(i);
			it.remove(); //제거
		}
		System.out.println("====================================");
		System.out.println(list.size());
		
	}
}

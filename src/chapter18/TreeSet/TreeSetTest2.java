package chapter18.TreeSet;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest2 {
	public static void main(String[] args) {
		
		//정렬을 하지만, 중복값을 허용하지 않음
		
		Set<Integer> set = new TreeSet<Integer>();
		
		set.add(5);
		set.add(4);
		set.add(3);
		set.add(2);
		set.add(1);
		set.add(1); //중복값
		
		for(Integer i : set) {
			System.out.println(i);
		}
		
	}
}

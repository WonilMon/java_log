package chapter18.TreeSet;

import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		
		//정렬을 해주는 자료구조
		//중복값을 허용하지 않음
		
		TreeSet<String> treeSet = new TreeSet<String>();
		
		treeSet.add("선덕여왕");
		treeSet.add("고주몽");
		treeSet.add("박혁거세");
		treeSet.add("이순신");
		treeSet.add("도요토미 히데요시");
		treeSet.add("도요토미 히데요시");
		
		for(String str : treeSet) {
			System.out.println(str);
		}
		
	}
	
	// 응용
	// 내가 만든 다른 객체들을 정렬하고 싶을 떄, TreeSet에 넣어주면 알아서 정렬이 됨!!

}

package chapter18.TreeSet;

import java.util.Comparator;
import java.util.TreeSet;

	// TreeSet 정렬순서를 바꿔주는 인터페이스
	// Comparator : String type 두 객체가 들어왔을때 정렬해줌 
	// 하나의 메서드만 가지고있다

class MyCompare implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) { 	// '매개변수로 두 비교값이 들어왔을 때 어떤 기준으로 할래?' 라고 묻는거
		return (o1.compareTo(o2)) * -1;			// 1 : 오름차순, -1 : 내림차순 
	}
	
}

//===========================================================================================

public class TreeSetTest3 {

	public static void main(String[] args) {
		
		//정렬을 해주는 자료구조
		//중복값을 허용하지 않음
		
		TreeSet<String> treeSet = new TreeSet<String>(new MyCompare());
		
		treeSet.add("선덕여왕");
		treeSet.add("선덕여왕");
		treeSet.add("고주몽");
		treeSet.add("고주몽");
		treeSet.add("박혁거세");
		treeSet.add("박혁거세");
		treeSet.add("이순신");
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


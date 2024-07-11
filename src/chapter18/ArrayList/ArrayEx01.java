package chapter18.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayEx01 {

	// - List : ArrayList / Vector / Linked 로 구성
		
	public static void main(String[] args) {
		
		String as[] = new String[10]; //배열은 초기값을 줘야 배열이 생성되잖아요? (배열 : 고정길이)
		as[0] = "안녕";
		
		
		List<String> ls = new ArrayList<String>(); //업캐스팅
		//얘는 값을 넣을 때마다 하나씩 공간이 만들어짐 (애초에 인덱스가 없음, 배열리스트 : 가변길이)
		ls.add("Hi");
		System.out.println(ls.size());
		System.out.println(ls.get(0));
		
		ls.add("Happy");
		System.out.println(ls.size());
		System.out.println(ls.get(1));
		
		ls.add("Hell");
		System.out.println(ls.size());
		System.out.println(ls.get(2));
		
		System.out.println("------------------------");
		
		for(int i=0; i<ls.size(); i++) {
			System.out.println(i + " : " + ls.get(i));
		}
		
		System.out.println("------데이터 추가 후--------");
		
		ls.add(2, "Good"); //2번방에 집어넣으면 기존에 있던 2번방의 "HELL"은 3번방으로 밀림
		
		for(int i=0; i<ls.size(); i++) {
			System.out.println(i + " : " + ls.get(i));
		}
		
		System.out.println("------데이터 삭제 후--------");
		
		ls.remove(0); //0번째의 값이 사라지고 그 뒤의 값들이 다 떙겨짐
		
		for(int i=0; i<ls.size(); i++) {
			System.out.println(i + " : " + ls.get(i));
		}
		
		
	}

}

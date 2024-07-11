package chapter22;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest01 {

	public static void main(String[] args) {
		

		List<Member> members = new ArrayList<Member>();
	      
		members.add(new Member("신진혁", "남자", 37, "서울"));
		members.add(new Member("한성무", "남자", 37, "인천"));
		members.add(new Member("김지성", "남자", 35, "인천"));
		members.add(new Member("박창훈", "남자", 30, "서울"));
		members.add(new Member("신화진", "여자", 28, "부산"));
		members.add(new Member("김주은", "여자", 25, "파주"));
		members.add(new Member("이채윤", "여자", 28, "서울"));
		members.add(new Member("김병효", "남자", 28, "남양주"));
		members.add(new Member("김찬희", "남자", 29, "김해"));
		members.add(new Member("윤영훈", "남자", 26, "원주"));
		members.add(new Member("백유기", "남자", 24, "춘천"));
		members.add(new Member("박수연", "여자", 25, "부산"));
		
		//Stream 이라는 건 하나의 객체임 (컬렉션값들을 stream 값으로 변환시켜주는)
		Stream<Member> stream1 = members.stream();
		stream1.forEach(name->System.out.println(name));//forEach : Stream 으로 바뀐 값들을 다 출력해주는
		
		//Stream 은 선언한 것 하나당 한 번만 쓸 수 있음 (데이터 처리 후 스트림 종료)
		//따라서 이렇게 바로 선언하고 사용
		System.out.println(members.stream().count());
		members.stream().forEach(s->System.out.println(s));
		
		
	}

}

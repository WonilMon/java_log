package chapter22;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class MemberMain {

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
		
		//나이가 30 이상인 회원을 출력
		List<Member> list = new ArrayList<Member>();
		for(Member m : members) {
			if(m.getAge()>=30) {
				list.add(m);
			}
		}
		for(Member m : list) {
			System.out.println(m);
		}
		//기존엔 이런 방식으로 조건에 맞게 담아두고 출력
		
		System.out.println("===============================================");
		
		//스트림 : 컬렉션 안에 있는 데이터를 스트림화
		//		멤버들이 가진 				멤버변수를 써서 나이가 30이상인 값들 추출
		List<Member> list2 = members.stream().filter(member->member.getAge()>=30)
											.collect(Collectors.toList());
		for(Member m : list2) {
			System.out.println(m);
		}
		
		System.out.println("===============================================");
		
	}

}

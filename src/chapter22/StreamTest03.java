package chapter22;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import chapter21.Member;

public class StreamTest03 {
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
		members.add(new Member("백유기", "여자", 25, "부산"));//동명이인
		members.add(new Member("박수연", "여자", 25, "부산"));
		members.add(new Member("박수연", "여자", 25, "부산"));//중복값
		
		System.out.println("------------------------------------");
		System.out.println("이름이 백유기인 회원을 출력");
		//#1 findFirst : 조건에 맞는 '첫번째'값을 보장 / Optional 타입으로 반환 
		Optional<Member> foundName =
				members.stream().filter(member->member.getName().equals("백유기"))
								.findFirst();
		//Optional : Null 처리클래스
		foundName.ifPresentOrElse(member->System.out.println("member")
									, ()->System.out.println("회원이 존재하지 않습니다"));
		//isPresent : 값이 존재하면 true, 없으면 false
		//ifPresentOrElse : 값이 존재하면 동작수행, 없으면 빈 동작수행
		
		System.out.println("------------------------------------");
		System.out.println("나이가 25살인 회원을 출력");
		//#2 findAny : 조건에 맞는 '첫번째 값을 추출 (보장 x) / Optional 타입으로 반환 
		Optional<Member> foundAge = 
				members.stream().filter(member->member.getAge()==25).findAny();
		foundAge.ifPresentOrElse(member->System.out.println(member)
									, ()->System.out.println("회원이 존재하지 않습니다"));
		
		System.out.println("------------------------------------");
		System.out.println("회원의 이름만 추출해 새로운 List를 생성");
		//#3 collect
		List<String> listName = members.stream().map(member->member.getName()).collect(Collectors.toList());
		listName.stream().forEach(name->System.out.println(name));
		
		System.out.println("------------------------------------");
		System.out.println("회원님의 이름만 추출해 하나의 문자열로");
		//#4 joining : 스트립 요소를 문자열로 연결
		String str = 
				members.stream().map(member->member.getName())
								.collect(Collectors.joining(", "));
		System.out.println(str);
		
		
	}
}

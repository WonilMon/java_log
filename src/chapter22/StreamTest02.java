package chapter22;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;

public class StreamTest02 {

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
		members.add(new Member("박수연", "여자", 25, "부산"));//중복값
		
		//#1 필터(filter) : 전체 데이터에서 원하는 데이터만 추출하는 연산
		members.stream().filter(member->member.getAge()>=30).forEach(member->System.out.println(member));
		//		stream().중간연산(filter, map 등)				.최종연산
		System.out.println("==========================================================================");
		members.stream().filter(member->member.getAge()>=30 && member.getResidence().equals("서울"))
															.forEach(member->System.out.println(member));
		//				.중간연산은 무한 (조건을 계속 줄 수 있다)
		System.out.println("==========================================================================");
		members.stream().filter(member->member.getAge()>=25 && member.getGender().equals("여자"))
															.forEach(member->System.out.println(member));
		System.out.println("==========================================================================");
		
		//#2 맵(map) : 타입을 다른 타입으로 변환
		members.stream().map(member->member.getName()).forEach(name->System.out.println(name));//String 으로
		System.out.println("==========================================================================");
		members.stream().filter(member->member.getGender().equals("남자"))
						.map(member->member.getName())
						.forEach(name->System.out.println(name));//filter + map
		System.out.println("==========================================================================");
		//#3 mapToInt : Stream 을 IntStream 으로 변환 (IntStream : int0 값을 처리하기 위한 Stream)
		OptionalDouble averageMember = 
		members.stream().mapToInt(member->member.getAge()).average();
		//				.중간연산								IntStream 의 함수 (수학계산 시 용이)
		
		if(averageMember.isPresent()) {	//데이터가 있는지 없는지 판별하는 메서드
			System.out.println("회원의 평균나이 : " + averageMember.getAsDouble());
		}else {
			System.out.println("회원이 없습니다");}
		System.out.println("==========================================================================");
		OptionalDouble averageIncheonMember = 
		members.stream().filter(member->member.getResidence().equals("인천"))
						.mapToInt(member->member.getAge()).average();
		
		if(averageMember.isPresent()) {
			System.out.println("인천 회원의 평균나이 : " + averageIncheonMember.getAsDouble());
		}else {
			System.out.println("회원이 없습니다");}
		System.out.println("==========================================================================");
		OptionalDouble averageSeoulMember =
		members.stream().filter(member->member.getResidence().equals("서울"))
						.mapToInt(member->member.getAge()).average();
		
		if(averageMember.isPresent()) {
			System.out.println("서울 회원의 평균나이 : " + averageSeoulMember.getAsDouble());
		}else {
			System.out.println("회원이 없습니다");}
		System.out.println("==========================================================================");
		//#4 distinct() : 중복제거
		members.stream().filter(member->member.getGender().equals("여자"))
						.distinct()												//equals 랑 hashCode 재정의
						.forEach(member->System.out.println(member));
		System.out.println("==========================================================================");
		//#5 sorted() : 정렬 (TreeMap을 쓰지않아도 되는 이유)
		members.stream().sorted((m1,m2)->m1.getName().compareTo(m2.getName()))	//Lambda 로 Comparator 사용
						.forEach(name->System.out.println(name));
		members.stream().sorted(Comparator.comparing(Member::getName))
						.forEach(name->System.out.println(name));
		members.stream().sorted(Comparator.comparing(Member::getAge)
										  .thenComparing(Member::getName))		//정렬 조건 추가
						.forEach(name->System.out.println(name));
		
	}

}

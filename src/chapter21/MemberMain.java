package chapter21;

import java.util.List;

public class MemberMain {

	public static void main(String[] args) {
		
		MemberService service = new MemberService();
		
		//요구사항 1 - 거주지 검색
		List<Member> memberResidence = service.searchResidence("서울");
		service.search(memberResidence);
		
		System.out.println("-------------------");
		
		//요구사항 2 : 성별 검색
		List<Member> memberGender = service.searchGender("여자");
		service.search(memberGender);
		
		System.out.println("----------------------------------------");
		
		//인터페이스 - 익명클래스
		List<Member> result = service.searchRequest(new SearchFilter() {
			
			//인터페이스의 search 를 메인에서 재정의(age, gender,, 등) 해주면 여러 메서드 만들필요없음
			@Override
			public boolean search(Member member) {
				if(member.getResidence().equals("부산")) {	
					return true;
				}else {
					return false;
				}
				
			}
		});
		service.search(result);
		
		System.out.println("----------------------------------------");
		//람다
		//매개변수, 매개변수 활용해서 넣는 코드만 남기면 돼
		
		//MemberService service = new MemberService();
		//1. 멤버서비스 선언
		//2.
		List<Member> result2 = service.searchRequest(member->member.getGender().equals("여자"));
		service.search(result2);
		
	}

}

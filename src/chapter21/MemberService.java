package chapter21;

import java.util.ArrayList;
import java.util.List;

interface SearchFilter {
	boolean search (Member member);
}

//----------------------------------------------------------------

public class MemberService {
	
	private List<Member> members;
	
	public MemberService () {
		members = new ArrayList<Member>();
		init();
	}
	
	private void init () {
		
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
		
	}
	
	public void search(List<Member> list) {
		for(Member m : list) {
			System.out.println(m);
		}
	}
	//-------------------------------------------------------------
	//요구사항 1 : 거주지 검색
	public List<Member> searchResidence(String residence) {
		List<Member> searchMember = new ArrayList<Member>();
		
		for(Member mem: members) {
			if(mem.getResidence().equals(residence)) {
				searchMember.add(mem);
			}
		}
		return searchMember;
	}
	
	//요구사항 2 : 성별 검색
	public List<Member> searchGender(String gender) {
		List<Member> searchMember = new ArrayList<Member>();
		
		for(Member mem: members) {
			if(mem.getGender().equals(gender)) {
				searchMember.add(mem);
			}
		}
		return searchMember;
	}
	
	//두 개의 요구사항이 똑같은 매커니즘으로 작용하고있음
	//-------------------------------------------------------------	
	//개선 - 인터페이스
	public List<Member> searchRequest(SearchFilter filter) {//상속
		List<Member> searchMember = new ArrayList<Member>();
		for(Member mem: members) {
			if(filter.search(mem)) {
				searchMember.add(mem);
			}
		}
		return searchMember;
	}
	//-------------------------------------------------------------
	
}

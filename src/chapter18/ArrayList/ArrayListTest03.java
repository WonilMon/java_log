package chapter18.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

class Member { //1. 아이디와 이름을 필요로 하는 하나의 클래스(객체)를 만들었죠?
	
	private int id;
	private String name;
	
	public Member(int id,String name) {
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return name + " 회원님의 아이디는 " + id + " 입니다.";
	}
	//--------------------------------------------------
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	//--------------------------------------------------
}

//==============================================================================================

class MemberArrayList {
	
	//<Member>를 넣으면 Member 를 담을 수 있는 배열이 되는 것
	private ArrayList<Member> arrayList; //2. 계속 끌고다닐 수 있도록 선언
	
	public MemberArrayList() {
		arrayList = new ArrayList<Member>();
	}//생성자. (3. 만들면 담을수있는 arrayList 가 하나 생성이 되겠죠?)
	
	//저장
	public void addMember(Member member) {
		arrayList.add(member);
	}//4. void 를 쓰면 member 라는 객체를 하나씩 생성자로 가서 담을 거임
	
	//삭제
	public boolean removeMember(int id) { 	//void 나 boolean 이나 상관없ㅋ
		Iterator<Member> it = arrayList.iterator();
		
		while(it.hasNext()) {				//순회하면서 마지막에 빠져나오는 문 (has.next())
			Member member = it.next();  	//member1부터 5까지 next 를 이용해서 계속 돌리는데 (while)
			int tempId = member.getId(); 	
			if (tempId == id) { 			//내가보낸 임유진의 매개변수 id 와 돌리면서 본 tempId 가 같으면
 				arrayList.remove(member); 	//(index 말고 객체를 넣어주면) 해당객체의 정보가 삭제됨
				return true;
			}//if
		}//while
		System.out.println(id + "가 존재하지 않습니다");
		return false;
	}
	
	//정보출력
	public void showAllMember() {
		for(Member m : arrayList) {
			System.out.println(m);
		}
		System.out.println();
	}
	
}

//==============================================================================================

public class ArrayListTest03 {

	public static void main(String[] args) {
		
		Member member1 = new Member(1000, "한치헌");
		Member member2 = new Member(1001, "전민석");
		Member member3 = new Member(1002, "임유진");
		Member member4 = new Member(1003, "이예찬");
		Member member5 = new Member(1004, "김윤석");
		
		MemberArrayList ml = new MemberArrayList(); //만들어지는 순간 위의 생성자를 통해 담을수있는 게 생성
		ml.addMember(member1); 				//멤버 1,2,3,4 를 매개변수로 넣어주면 각각 arrayList에 담기죠
		ml.addMember(member2);
		ml.addMember(member3);
		ml.addMember(member4);
		ml.addMember(member5);
		
		ml.showAllMember();
											//만약 임유진을 삭제하고싶다
		ml.removeMember(member3.getId()); 	//1002라는 값을 가진 member3.getId() 를 넣어주면
		
		ml.showAllMember();
		
	}

}

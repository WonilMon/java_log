package chapter07;

public class TeamMemberMain {

	public static void main(String[] args) {
		
		TeamMember t = new TeamMember();
		t.setTeamName("1팀");
		t.setmName("구유진");
		t.setmPhone("010-1111-2222");
		t.setName("오현석");
		t.setGender("남성");
		
		System.out.println("팀명 : " + t.getTeamName());
		System.out.println("팀장 : " + t.getmName());
		System.out.println("팀장 번호 : " + t.getmPhone());
		System.out.println("팀원 : " + t.getName());
		System.out.println("팀원 성별 : " + t.getGender());
		
		System.out.println("--------------------------");
		
		TeamGroup team = new TeamGroup();
		team.init();
		team.disp();
		
		
	}//main

}//class

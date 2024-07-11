package chapter07;

public class TeamGroup {

	//멤버변수
	private TeamMember member [] = new TeamMember[5]; //배열은 이렇게
	//		TeamMember member    = new TeamMember();  //원래는 이렇게
	
	public void init() {
		
		member[0] = new TeamMember("2팀", "윤동민");
		member[1] = new TeamMember("2팀", "권유진");
		member[2] = new TeamMember("2팀", "조현상");
		member[3] = new TeamMember("2팀", "최성현");
		member[4] = new TeamMember("2팀", "김용민");
		
	}
	
	public void disp () {
		for (int i=0; i<member.length; i++) {
			System.out.println("팀명 : " + (member[i].getTeamName()));
			System.out.println("이름 : " + (member[i].getName()));
			System.out.println("------------------------------------");
		}
	}
	
}

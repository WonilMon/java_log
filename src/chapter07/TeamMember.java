package chapter07;

public class TeamMember {

	//멤버변수
	private String teamName;
	private String mName;
	private String mPhone;
	private String name;
	private String gender;
	
	//생성자(오버로딩)
	public TeamMember() {} //같이 작성해야 오류안뜸
	public TeamMember(String teamName, String name) {
		
		this.teamName = teamName;
		this.name = name;
	}
		
	//메서드
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public String getmName() {
		return mName;
	}
	public void setmName(String mName) {
		this.mName = mName;
	}
	public String getmPhone() {
		return mPhone;
	}
	public void setmPhone(String mPhone) {
		this.mPhone = mPhone;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
	
	
}

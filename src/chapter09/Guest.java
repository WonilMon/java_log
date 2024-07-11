package chapter09;

public class Guest {
	
	private String name;
	private String gender;
	private String ssn;
	
	public Guest (String name, String gender, String ssn) {
		this.name = name;
		this.gender = gender;
		this.ssn = ssn;
	}
	
	//-----------------------------------------------------
	public String getName() {
		return name;
	}

	public String getGender() {
		return gender;
	}

	public String getSsn() {
		return ssn;
	}
	//-----------------------------------------------------
}

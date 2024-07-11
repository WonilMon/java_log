package chapter09;

public class Company {
	
	private static Company instance = new Company();
	
	public Company () {}
	
	//싱글톤 객체생성 메서드
	//-----------------------------------------------
	public static Company getInstance() {
		
		if(instance == null) {
			instance = new Company();
		}//예외처리
		return instance;
	}

	public static void setInstance(Company instance) {
		Company.instance = instance;
	}
	//-----------------------------------------------	
	
}

package chapter09;

public class Bank {
	
	private String name;
	private String tel;
	
	static float interest;
	
	public Bank(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}//생성자
	
	public void getBank() {
		System.out.println("지점 : " + name + "\n 전화번호 : " + tel + "\n 은행이자 : " + interest);
	}
	
}//Bank

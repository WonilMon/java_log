package chapter10;

public class Fruit {
	
	private String sort;
	private String season;
	
	public void set(String a,String b) {
		sort = a;
		season = b;
	}
	
	public void disp() {
		System.out.println("분류 : " + sort + " | 계절 : " + season);
	}
	
}

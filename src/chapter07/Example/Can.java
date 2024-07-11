package chapter07.Example;

public class Can {

	//필드
	private String canName;
	private int price;
	
	//생성자
	public Can (String canName, int price) {
		this.canName = canName;
		this.price = price;
	}
	
	//메서드
	public String getCanName() {
		return canName;
	}

	public int getPrice() {
		return price;
	}
	
	
	
}
